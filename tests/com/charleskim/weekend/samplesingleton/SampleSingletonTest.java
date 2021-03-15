package com.charleskim.weekend.samplesingleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleSingletonTest {
    @Test
    public void testGetInstance() {
        assertEquals(SampleSingleton.getInstance(),
            SampleSingleton.getInstance());
    }
}
