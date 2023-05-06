package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.factory.DellFactory;
import org.springframework.cloud.pattern.factory.Factory;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        Factory factory = new DellFactory();
        factory.produceKeyboard();
        factory.produceMonitor();
        factory.produceMouse();
    }
}
