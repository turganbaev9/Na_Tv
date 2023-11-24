package kg.beka.na_tv.service;

import kg.beka.na_tv.model.Price;
import kg.beka.na_tv.model.dto.PriceDTO;

import java.util.List;

public interface PriceService {
    PriceDTO save(PriceDTO priceDTO);
    List<Price> findAll();
}
