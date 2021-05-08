package com.javadeveloperzone.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Date orderDate;
    private Long userId;
}
