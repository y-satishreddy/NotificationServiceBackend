import com.skylimit.notification.Notification.mapper.NotificationMapper;
import com.skylimit.notification.Notification.service.NotificationServiceImpl;
import com.skylimit.notification.Notification.dto.NotificationRequest;
import com.skylimit.notification.Notification.dto.NotificationResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {

    @Mock
    private NotificationMapper notificationMapper;

    @InjectMocks
    private NotificationServiceImpl notificationService;

    @Test
    public void testProcessNotification() {

        NotificationRequest request = new NotificationRequest(123L, "TEST_EVENT", "Test Message");
        NotificationResponse expectedResponse = new NotificationResponse("TEST_EVENT", "Test Message");

        when(notificationMapper.toResponse(request)).thenReturn(expectedResponse);

        NotificationResponse response = notificationService.processNotification(request);

        assertEquals(expectedResponse.getEventType(), response.getEventType());
    }
}