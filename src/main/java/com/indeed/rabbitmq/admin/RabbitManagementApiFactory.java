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
     * @param uri the URI to the {@code RabbitMQ} service.
     * @param username the name of the administrator.
     * @param password the administrator's password.
     * @return an instance of the {@code RabbitManagementApi} interface.
     */
    public static RabbitManagementApi newInstance(final URI uri, final String username, final String password) {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);

        final OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();

        if ((null != username) && (null != password)) {
            okHttpBuilder.addInterceptor(new AuthenticationInterceptor(username, password));
        }

        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .baseUrl(uri.toASCIIString())
                .client(okHttpBuilder.build())
                .build()
                .create(RabbitManagementApi.class);
    }

    public static RabbitManagementApi newInstance(final URI uri) {
        return newInstance(uri, null, null);
    }

    private RabbitManagementApiFactory() {
    }
}
