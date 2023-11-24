package kg.beka.na_tv.controllers;

import kg.beka.na_tv.model.Order;
import kg.beka.na_tv.model.dto.OrderDTO;
import kg.beka.na_tv.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/order")
public class OrderController {
    private  final OrderService orderService;
    @PostMapping("save")
    public OrderDTO save(@RequestBody OrderDTO orderDTO){
      return   orderService.save(orderDTO);
    }
    @GetMapping("/search")
    public List<Order> searchOrders(@RequestParam String searchQuery) {
        return orderService.searchOrders(searchQuery);
    }
}
