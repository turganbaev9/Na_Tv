package kg.beka.na_tv.service.Impl;

import kg.beka.na_tv.mapper.OrderDatesMapper;
import kg.beka.na_tv.model.OrderDates;
import kg.beka.na_tv.model.dto.OrderDatesDTO;
import kg.beka.na_tv.repository.OrderDatesRep;
import kg.beka.na_tv.service.OrderDatesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDatesServiceImpl implements OrderDatesService {
  private final OrderDatesRep orderDatesRep;
    @Override
    public OrderDatesDTO save(OrderDatesDTO orderDatesDTO) {

        OrderDates orderDate= OrderDatesMapper.INSTANCE.toEntity(orderDatesDTO);
        return null;
    }
}
