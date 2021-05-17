package com.javadeveloperzone.controller;

import com.javadeveloperzone.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javadeveloperzone.modal.Notification;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private static final Logger log = LoggerFactory.getLogger(NotificationController.class);

    @Autowired
    private NotificationService notificationService;

    @PostMapping("")
    public Notification save(@RequestBody Notification notification) {
        return notificationService.save(notification);
    }
}
