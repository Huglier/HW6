package pro.sky.HW6.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW6.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping("/add")
    public void addItem(@RequestParam List<Integer> itemId){
        orderService.addItem(itemId);
    }
    @GetMapping("/get")
    public List<Integer> getItem(){
        return orderService.getItem();
    }
}
