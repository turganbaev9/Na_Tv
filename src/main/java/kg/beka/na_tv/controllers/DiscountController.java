package kg.beka.na_tv.controllers;

import kg.beka.na_tv.model.Discount;
import kg.beka.na_tv.model.dto.DiscountDTO;
import kg.beka.na_tv.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/discount")
@RequiredArgsConstructor
public class DiscountController {
    private  final DiscountService service;
    @PostMapping("/save")
    public DiscountDTO save(@RequestBody DiscountDTO discountDTO){
        return service.save(discountDTO);
    }
    @GetMapping("/findAll")
    public List<Discount> findAll(){
       return service.findAll();
    }
}
