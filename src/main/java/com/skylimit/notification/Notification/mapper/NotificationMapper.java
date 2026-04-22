package com.skylimit.notification.Notification.mapper;

import org.springframework.stereotype.Component;

import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;

@Component
public class NotificationMapper {

    public NotificationResponse toResponse(NotificationRequest request) {
        return new NotificationResponse(request.getEventType(), request.getMessage());
    }

}
