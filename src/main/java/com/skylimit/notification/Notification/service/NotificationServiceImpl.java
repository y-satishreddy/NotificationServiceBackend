package com.skylimit.notification.Notification.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;
import com.skylimit.notification.Notification.mapper.NotificationMapper;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Service
public class NotificationServiceImpl implements NotificationService {

    private NotificationMapper notificationMapper;
    @Override
    public NotificationResponse processNotification(NotificationRequest request) {
        System.out.println(request.toString());
        return notificationMapper.toResponse(request);
    }
}
