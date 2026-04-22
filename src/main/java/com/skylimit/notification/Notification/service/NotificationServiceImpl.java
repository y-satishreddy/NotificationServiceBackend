package com.skylimit.notification.Notification.service;

import org.springframework.stereotype.Component;

import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;
import com.skylimit.notification.Notification.mapper.NotificationMapper;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    public NotificationMapper notifcationMapper;
    @Override
    public NotificationResponse processNotification(NotificationRequest request) {
        System.out.println(request.toString());
        return notifcationMapper.toResponse(request);
    }
}
