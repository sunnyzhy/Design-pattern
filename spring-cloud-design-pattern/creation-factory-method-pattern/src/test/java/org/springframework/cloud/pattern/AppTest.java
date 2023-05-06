package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.factory.DellKeyboardFactory;
import org.springframework.cloud.pattern.factory.KeyboardFactory;
import org.springframework.cloud.pattern.product.Keyboard;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        KeyboardFactory keyboardFactory = new DellKeyboardFactory();
        Keyboard keyboard = keyboardFactory.produce();
        keyboard.display();
    }
}
