package com.indeed.rabbitmq.admin.pojo;

import org.junit.Test;

import java.beans.IntrospectionException;

import static java.util.Collections.singletonMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class VirtualHostTest {
    @Test
    public void testToString() {
        assertNotNull(new VirtualHost().toString());
    }

    @Test
    public void testAdditionalProperty_set() {
        final VirtualHost instance = new VirtualHost();
        instance.setAdditionalProperty("unit", "test");
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }

    @Test
    public void testAdditionalProperty_with() {
        final VirtualHost instance = new VirtualHost();
        assertSame(instance, instance.withAdditionalProperty("unit", "test"));
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }
}
