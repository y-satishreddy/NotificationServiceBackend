package com.skylimit.notification.Notification.service;

import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;

public interface NotificationService {
public NotificationResponse processNotification(NotificationRequest request);
}
