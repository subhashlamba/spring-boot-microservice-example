package com.javadeveloperzone.service;

import com.javadeveloperzone.modal.Notification;
import com.javadeveloperzone.modal.OrderDetails;
import com.javadeveloperzone.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDetailsRepository orderRepository;

    @Autowired
    private NotificationServiceClient notificationServiceClient;

    public OrderDetails save(OrderDetails order){
        OrderDetails orderDetails = orderRepository.save(order);

        Notification notification = new Notification();
        notification.setUserId(order.getUserId());
        notification.setNotificationType("SMS");
        notification.setMobileNo("99 99 99 99 99");
        notificationServiceClient.sendNotification(notification);

        return orderDetails;
    }

    public List<OrderDetails> findOrderByUserId(Long userId){
        return this.orderRepository.findOrdersByUserId(userId);
    }
}
