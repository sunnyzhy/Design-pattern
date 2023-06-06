package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.cloud.pattern.template.Compute;
import org.springframework.cloud.pattern.template.MultiplyCompute;
import org.springframework.cloud.pattern.template.PlusCompute;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void test() {
        Compute plusCompute = new PlusCompute();
        plusCompute.duration();

        Compute multiplyCompute = new MultiplyCompute();
        multiplyCompute.duration();
    }
}
