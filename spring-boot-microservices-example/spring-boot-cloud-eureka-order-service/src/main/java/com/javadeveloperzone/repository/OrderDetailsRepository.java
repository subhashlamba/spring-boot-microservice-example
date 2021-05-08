package com.javadeveloperzone.repository;

import com.javadeveloperzone.modal.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
    List<OrderDetails> findOrdersByUserId(Long userId);
}
