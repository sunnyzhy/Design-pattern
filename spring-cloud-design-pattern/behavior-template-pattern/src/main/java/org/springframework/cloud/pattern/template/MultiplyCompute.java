package org.springframework.cloud.pattern.template;

/**
 * @author zhy
 * @date 2023/6/6 9:50
 */
public class MultiplyCompute extends Compute {
    @Override
    public long calculate() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
