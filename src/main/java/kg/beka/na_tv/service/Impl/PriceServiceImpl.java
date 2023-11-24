package kg.beka.na_tv.service.Impl;

import kg.beka.na_tv.mapper.PriceMapper;
import kg.beka.na_tv.model.Discount;
import kg.beka.na_tv.model.Price;
import kg.beka.na_tv.model.Text;
import kg.beka.na_tv.model.dto.PriceDTO;
import kg.beka.na_tv.repository.DiscountRep;
import kg.beka.na_tv.repository.PriceRep;
import kg.beka.na_tv.repository.TextRep;
import kg.beka.na_tv.service.DiscountService;
import kg.beka.na_tv.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {
    private  final PriceRep priceRep;
private  final TextRep textRep;
private final DiscountService discountService;
 private  final DiscountRep discountRep;
    @Override
    public PriceDTO save(PriceDTO priceDTO) {
        Price price= PriceMapper.INSTANCE.toEntity(priceDTO);
        Text text= textRep.findById(priceDTO.getTextDTO().getId()).orElseThrow(()
                 -> new NoSuchElementException("Text with ID not found"));
        Discount discount=discountRep.findById(priceDTO.getDiscountDTO().getId()).orElseThrow(()
                        ->new NoSuchElementException("Discount with ID not found"));
        Double totalPrice = countPrice(Collections.singletonList(text),price);
      price.setDiscount(discount);
        price.setText(text);
        price.setPrice(totalPrice);
        priceRep.save(price);
        return PriceMapper.INSTANCE.toDTO(price);
    }

    @Override
    public List<Price> findAll() {
        return priceRep.findAll();
    }
    public Double countPrice(List<Text> texts,Price price){

        double pricePerSymbol=price.getPricePerSimbol();
        double totalPrice=0;
        pricePerSymbol=price.getPricePerSimbol();
        for (Text text : texts) {
            int symbolCount= text.getSymbolCount();
            double textPrice=symbolCount*pricePerSymbol;
            totalPrice+=textPrice;
        }
return totalPrice;
    }
}
