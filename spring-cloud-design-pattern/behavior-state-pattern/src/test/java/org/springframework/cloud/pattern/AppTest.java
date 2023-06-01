package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.context.Context;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Context context = new Context();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        // 重新设置 Running 状态
        context.getCPU();
        context.stop();
    }
}
