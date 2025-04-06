package com.vottie.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void testSayHello() {
        Hello hello = new Hello();
        assertEquals("Hello, World!", hello.sayHello());
    }
} 