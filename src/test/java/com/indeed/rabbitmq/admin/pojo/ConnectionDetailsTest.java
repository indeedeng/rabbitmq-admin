package com.indeed.rabbitmq.admin.pojo;

import org.junit.Test;

import java.beans.IntrospectionException;

import static java.util.Collections.singletonMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ConnectionDetailsTest {
    @Test
    public void testToString() {
        assertNotNull(new ConnectionDetails().toString());
    }

    @Test
    public void testAdditionalProperty_set() {
        final ConnectionDetails instance = new ConnectionDetails();
        instance.setAdditionalProperty("unit", "test");
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }

    @Test
    public void testAdditionalProperty_with() {
        final ConnectionDetails instance = new ConnectionDetails();
        assertSame(instance, instance.withAdditionalProperty("unit", "test"));
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }
}
