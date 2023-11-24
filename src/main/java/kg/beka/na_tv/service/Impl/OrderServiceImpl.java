package kg.beka.na_tv.service.Impl;

import kg.beka.na_tv.mapper.OrderMapper;
import kg.beka.na_tv.model.*;
import kg.beka.na_tv.model.dto.OrderDTO;
import kg.beka.na_tv.repository.*;
import kg.beka.na_tv.service.DiscountService;
import kg.beka.na_tv.service.OrderService;
import kg.beka.na_tv.service.PriceService;
import kg.beka.na_tv.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
   private  final OrderRep orderRep;
private final PriceRep priceRep;
    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        Order order = OrderMapper.INSTANCE.toEntity(orderDTO);
        // Получаем информацию о цене и тексте для расчета
        Long priceId = orderDTO.getPrice().getId();
        Price price = priceRep.findPriceAndDiscountById(priceId);

        if (price != null) {
            // Расчет общей цены до скидки
            Double pricePerSymbol = price.getPricePerSimbol();
            Date startDate = price.getStartDate();
            Date endDate = price.getEndDate();
            long duration = ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
            double totalPriceWithoutDiscount = pricePerSymbol * duration;

            // Проверяем, есть ли скидка
            Discount discount = price.getDiscount();
            if (discount != null) {
                // Расчет цены с учетом скидки
                double discountValue = discount.getDiscount();
                double totalPriceWithDiscount = totalPriceWithoutDiscount * (1 - discountValue);

                order.setPriceBeforeDiscount(totalPriceWithoutDiscount);
                order.setPriceWithDiscount(totalPriceWithDiscount);
                order.setTotalSum(totalPriceWithDiscount); // Устанавливаем общую сумму с учетом скидки
            } else {
                // Если скидки нет, то общая цена будет такой же, как и цена без скидки
                order.setPriceBeforeDiscount(totalPriceWithoutDiscount);
                order.setPriceWithDiscount(totalPriceWithoutDiscount);
                order.setTotalSum(totalPriceWithoutDiscount);
            }

            // Устанавливаем цену и текст в заказ
            order.setPrice(price);
            order.setText(price.getText());
        }

        // Сохраняем заказ
        orderRep.save(order);
        return OrderMapper.INSTANCE.toDTO(order);
    }



public  List<Order>searchOrders(String query){
       return orderRep.findByCreatedDateContainingOrFullNameClientContainingOrClientEmailContainingOrClientPhoneContaining(query);
}

    @Override
    public List<Order> findAll() {
        return orderRep.findAll();
    }

/*    @Override
    public List<Date> getAvailableDate() {
        List<Order> orders=orderRep.findAll();


    }*/
}
