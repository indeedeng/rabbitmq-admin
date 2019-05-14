package com.indeed.rabbitmq.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.net.URI;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

/**
 * Factory class used to construct the {@code RabbitManagementApi} proxy.
 *
 * @author Kevin Sitze (kevins@indeed.com)
 */
public class RabbitManagementApiFactory {
    /**
     * Construct and return a new {@code RabbitManagementApi} instance.
     *
     * @param uri the {@code java.net.URI} representing the base address of the RabbitMQ instance to talk to.
     * @param username the name of the administrator.
     * @param password the administrator's password.
     * @return an instance of the {@code RabbitManagementApi} interface.
     */
    public static RabbitManagementApi newInstance(final URI uri, final String username, final String password) {
        return newInstance(new OkHttpClient.Builder(), uri, username, password);
    }

    /**
     * Construct and return a new {@code RabbitManagementApi} instance with no authentication.
     *
     * @param uri the {@code java.net.URI} representing the base address of the RabbitMQ instance to talk to.
     * @return an instance of the {@code RabbitManagementApi} interface.
     */
    public static RabbitManagementApi newInstance(final URI uri) {
        return newInstance(new OkHttpClient.Builder(), uri, null, null);
    }

    /**
     * Construct and return a new {@code RabbitManagementApi} instance using the provided {@code okhttp3.OkHttpClient.Builder}.
     *
     * @param okHttpClientBuilder The client-configured {@code okhttp3.OkHttpClient.Builder}. An additional interceptor will be automatically
     *                            added for authentication if username and password are non-null.
     * @param uri the {@code java.net.URI} representing the base address of the RabbitMQ instance to talk to.
     * @param username the name of the administrator.
     * @param password the administrator's password.
     * @return an instance of the {@code RabbitManagementApi} interface.
     */
    public static RabbitManagementApi newInstance(final OkHttpClient.Builder okHttpClientBuilder, final URI uri, final String username, final String password) {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);

        if ((null != username) && (null != password)) {
            okHttpClientBuilder.addInterceptor(new AuthenticationInterceptor(username, password));
        }

        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .baseUrl(uri.toASCIIString())
                .client(okHttpClientBuilder.build())
                .build()
                .create(RabbitManagementApi.class);
    }

    private RabbitManagementApiFactory() {
    }
}
