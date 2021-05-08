package com.javadeveloperzone.service;

import com.javadeveloperzone.modal.Order;
import com.javadeveloperzone.modal.User;
import com.javadeveloperzone.modal.UserDetails;
import com.javadeveloperzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public UserDetails getUserById(Long id){
        ResponseEntity<Order[]> orders  = restTemplate.getForEntity("http://order-service/order/" + id, Order[].class);
        UserDetails userDetails=new UserDetails();
        userDetails.setUser( userRepository.findById(id).get());
        userDetails.setOrders(orders.getBody());
        return userDetails;
    }
}
