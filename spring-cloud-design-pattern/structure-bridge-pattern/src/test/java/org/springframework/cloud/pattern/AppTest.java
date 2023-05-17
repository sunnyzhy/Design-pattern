package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.abstraction.Circle;
import org.springframework.cloud.pattern.abstraction.Rectangle;
import org.springframework.cloud.pattern.abstraction.Shape;
import org.springframework.cloud.pattern.implementor.Blue;
import org.springframework.cloud.pattern.implementor.Red;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        Shape shape = new Circle();
        shape.setColor(new Blue());
        shape.draw();

        Shape shape1 = new Rectangle();
        shape1.setColor(new Red());
        shape1.draw();
    }
}
