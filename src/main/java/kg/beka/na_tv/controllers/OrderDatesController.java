package kg.beka.na_tv.controllers;
import kg.beka.na_tv.model.dto.OrderDatesDTO;
import kg.beka.na_tv.service.OrderDatesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/orderDates")
public class OrderDatesController {
    private  final OrderDatesService orderDatesService;
@PostMapping("/save")
    public OrderDatesDTO save(@RequestBody OrderDatesDTO orderDatesDTO){
    return orderDatesService.save(orderDatesDTO);
}

}
