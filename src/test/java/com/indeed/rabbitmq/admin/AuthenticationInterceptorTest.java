package com.indeed.rabbitmq.admin;

import okhttp3.Interceptor;
import okhttp3.Request;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AuthenticationInterceptorTest {
    @Test
    public void testInterceptor() throws IOException {
        final Interceptor.Chain facade = mock(Interceptor.Chain.class);
        final Request request = new Request.Builder()
                .url("http://indeed.com")
                .build();

        when(facade.request()).thenReturn(request);

        final AuthenticationInterceptor interceptor = new AuthenticationInterceptor("username", "password");

        final ArgumentCaptor<Request> captor = ArgumentCaptor.forClass(Request.class);

        interceptor.intercept(facade);

        verify(facade).proceed(captor.capture());

        assertEquals("Basic dXNlcm5hbWU6cGFzc3dvcmQ=", captor.getValue().header("Authorization"));
    }
}
