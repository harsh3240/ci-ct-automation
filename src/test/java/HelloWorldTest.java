package test.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.java.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.getMessage());
    }
}
