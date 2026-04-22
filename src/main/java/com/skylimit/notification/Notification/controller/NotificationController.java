package com.skylimit.notification.Notification.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;
import com.skylimit.notification.Notification.service.NotificationService;
import org.slf4j.Logger;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/notifications")
@AllArgsConstructor
public class NotificationController {

    public NotificationService notificationService;
    private static final Logger log = LoggerFactory.getLogger(NotificationController.class);

    @PostMapping
    public ResponseEntity<NotificationResponse> handleNotification(@RequestBody NotificationRequest request){
        log.info("POST /notifications API called");
        NotificationResponse response = notificationService.processNotification(request);
        log.info("Notification processed successfully: {}",response.toString());
        return ResponseEntity.ok(response);
    }
}
