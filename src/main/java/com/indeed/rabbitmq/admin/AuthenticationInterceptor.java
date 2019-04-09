package com.indeed.rabbitmq.admin;

import retrofit.RequestInterceptor;

import java.util.Base64;

import static java.nio.charset.StandardCharsets.US_ASCII;

/**
 * This class is responsible for sending authentication information to the
 * {@code RabbitMQ} server in order to access the administration API.
 *
 * @author Kevin Sitze (kevins@indeed.com)
 */
public class AuthenticationInterceptor implements RequestInterceptor {

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
    public void intercept(final RequestFacade requestFacade) {
        requestFacade.addHeader("Authorization", authorizationToken);
    }
}
