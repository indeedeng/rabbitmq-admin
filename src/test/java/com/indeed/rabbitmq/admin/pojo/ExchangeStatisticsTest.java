package com.indeed.rabbitmq.admin.pojo;

import org.junit.Test;

import java.beans.IntrospectionException;

import static java.util.Collections.singletonMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ExchangeStatisticsTest {
    @Test
    public void testToString() {
        assertNotNull(new ExchangeStatistics().toString());
    }

    @Test
    public void testAdditionalProperty_set() {
        final ExchangeStatistics instance = new ExchangeStatistics();
        instance.setAdditionalProperty("unit", "test");
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }

    @Test
    public void testAdditionalProperty_with() {
        final ExchangeStatistics instance = new ExchangeStatistics();
        assertSame(instance, instance.withAdditionalProperty("unit", "test"));
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }
}
