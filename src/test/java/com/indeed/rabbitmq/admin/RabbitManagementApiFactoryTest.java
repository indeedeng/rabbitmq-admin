package com.indeed.rabbitmq.admin;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RabbitManagementApiFactoryTest {

    @Test
    public void testNewInstance() {
        assertNotNull(RabbitManagementApiFactory.newInstance(URI.create("http://localhost:8180/")));
    }

    @Test
    public void testNewInstance_auth() {
        assertNotNull(RabbitManagementApiFactory.newInstance(URI.create("http://localhost:8180/"), "username", "password"));
    }
}
