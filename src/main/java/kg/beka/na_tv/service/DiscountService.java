package kg.beka.na_tv.service;
import kg.beka.na_tv.model.Discount;
import kg.beka.na_tv.model.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    DiscountDTO save(DiscountDTO discountDTO);
    List<Discount>findAll();
    void betweenDays(Discount discount);
}
