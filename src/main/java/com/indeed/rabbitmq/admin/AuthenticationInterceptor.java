package com.indeed.rabbitmq.admin;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.US_ASCII;

/**
 * This class is responsible for sending authentication information to the
 * {@code RabbitMQ} server in order to access the administration API.
 *
 * @author Kevin Sitze (kevins@indeed.com)
 */
public class AuthenticationInterceptor implements Interceptor {

    final Logger log = LoggerFactory.getLogger(AuthenticationInterceptor.class);

    public static String createAuthorizationToken(final String username, final String password) {
        return "Basic " + new String(Base64.getEncoder().encode((username + ':' + password).getBytes(US_ASCII)));
    }

    private String authorizationToken;

    public AuthenticationInterceptor(final String username, final String password) {
        authorizationToken = createAuthorizationToken(username, password);
    }

    public void setCredentials(final String username, final String password) {
        authorizationToken = createAuthorizationToken(username, password);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request original = chain.request();

        // Customize the request
        final Request request = original.newBuilder()
                .header("Authorization", authorizationToken)
                .build();

        final Response response = chain.proceed(request);

        return response;
    }
}
