package kg.beka.na_tv.controllers;

import kg.beka.na_tv.model.dto.PriceDTO;
import kg.beka.na_tv.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/price")
public class PriceController {
   private  final PriceService priceService;
    @PostMapping("/save")
    public PriceDTO save(@RequestBody PriceDTO priceDTO){
        return priceService.save(priceDTO);
    }
}
