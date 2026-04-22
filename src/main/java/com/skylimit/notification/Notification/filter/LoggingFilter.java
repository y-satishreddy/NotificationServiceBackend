package com.skylimit.notification.Notification.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
public class LoggingFilter implements Filter {

    private static final String CORRELATION_ID = "correlationId";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        String correlationId = httpRequest.getHeader(CORRELATION_ID);
       
        if (correlationId == null) {
            correlationId = UUID.randomUUID().toString();
        }
     
        MDC.put("correlationId", correlationId);
        MDC.put("method", httpRequest.getMethod());

        try {
            chain.doFilter(request, response); 
        } finally {
            MDC.clear(); 
        }
    }
}