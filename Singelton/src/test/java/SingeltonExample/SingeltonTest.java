package SingeltonExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingeltonTest {
    @Test
    public void testSingleton() {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        assertSame(instance1, instance2, "instance 1 should be the same as instance 2");

    }
}
