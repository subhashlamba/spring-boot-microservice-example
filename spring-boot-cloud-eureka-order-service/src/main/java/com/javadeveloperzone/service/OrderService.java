package com.javadeveloperzone.service;

import com.javadeveloperzone.modal.OrderDetails;
import com.javadeveloperzone.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDetailsRepository orderRepository;

    public OrderDetails save(OrderDetails order){
        return this.orderRepository.save(order);
    }

    public List<OrderDetails> findOrderByUserId(Long userId){
        return this.orderRepository.findOrdersByUserId(userId);
    }
}
