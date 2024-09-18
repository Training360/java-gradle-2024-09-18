package training;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Tag("issue10")
    @Test
    void sayHello() {
        assertEquals("Hello John Doe!",
                new Main().sayHello("John Doe"));
    }

    @Tag("issue20")
    @Test
    void sayHelloEmpty() {
        assertEquals("Hello !",
                new Main().sayHello(""));
    }
}