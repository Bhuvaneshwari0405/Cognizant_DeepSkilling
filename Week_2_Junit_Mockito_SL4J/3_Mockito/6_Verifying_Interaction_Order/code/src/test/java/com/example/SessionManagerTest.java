package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class SessionManagerTest {

    @Test
    public void testInteractionOrder() {
        UserSession mockSession = mock(UserSession.class);

        SessionManager manager = new SessionManager(mockSession);
        manager.runSession();

        InOrder inOrder = inOrder(mockSession);
        inOrder.verify(mockSession).login();
        inOrder.verify(mockSession).fetchData();
        inOrder.verify(mockSession).logout();
    }
}
