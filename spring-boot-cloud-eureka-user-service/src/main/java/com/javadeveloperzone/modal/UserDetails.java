package com.javadeveloperzone.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    private User user;
    private Order[] orders;

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
