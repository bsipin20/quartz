package org.bsipin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5ExampleTest {

    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
    }

    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }
}