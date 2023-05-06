package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.lazy.safe.internal.code.Singleton;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
