package com.indeed.rabbitmq.admin;

import org.junit.Test;
import retrofit.RequestInterceptor.RequestFacade;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class AuthenticationInterceptorTest {
    @Test
    public void testInterceptor() {
        final RequestFacade facade = createMock(RequestFacade.class);
        final AuthenticationInterceptor interceptor = new AuthenticationInterceptor("username", "password");
        facade.addHeader("Authorization", "Basic dXNlcm5hbWU6cGFzc3dvcmQ="); expectLastCall();

        replay(facade);
        interceptor.intercept(facade);
        verify(facade);
    }
}
