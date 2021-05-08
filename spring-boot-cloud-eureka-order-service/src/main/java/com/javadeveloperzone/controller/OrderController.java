package com.javadeveloperzone.controller;

import com.javadeveloperzone.modal.OrderDetails;
import com.javadeveloperzone.service.OrderService;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/order")
@Log4j
public class OrderController {

    public static final Logger log = LoggerFactory.getLogger(OrderController.class.getName());

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{userId}")
    public List<OrderDetails> findOrdersByUserId(@PathVariable Long userId) {
        log.info("getOrder of OrderController");
        return orderService.findOrderByUserId(userId);
    }

    @PostMapping(value = "/")
    public OrderDetails save(@RequestBody OrderDetails order){
        return orderService.save(order);
    }
}
