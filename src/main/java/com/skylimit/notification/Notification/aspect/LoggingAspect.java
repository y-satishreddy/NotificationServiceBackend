package com.skylimit.notification.Notification.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Around;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("execution (* com.skylimit.notification.Notification.controller.NotificationController.handleNotification(..))")
    public Object logHandleNotification(ProceedingJoinPoint jointPoint) throws Throwable{
        log.info("POST /notifcations API called");
        Object result = jointPoint.proceed();
        log.info("Response returned successfully");
        return result;
    }

}
