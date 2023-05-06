package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.factory.KeyboardFactory;
import org.springframework.cloud.pattern.product.Keyboard;
import org.springframework.cloud.pattern.resource.KeyboardType;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        Keyboard keyboard = keyboardFactory.produce(KeyboardType.Dell.getCode());
        if (keyboard != null) {
            keyboard.display();
        }
    }
}
