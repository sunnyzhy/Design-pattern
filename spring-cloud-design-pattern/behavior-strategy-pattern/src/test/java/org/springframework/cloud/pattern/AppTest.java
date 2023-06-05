package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.context.Context;
import org.springframework.cloud.pattern.strategy.Sale;
import org.springframework.cloud.pattern.strategy.SaleDiscount;
import org.springframework.cloud.pattern.strategy.SaleNormal;
import org.springframework.cloud.pattern.strategy.SaleRebate;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Context context = new Context();

        Sale sale1 = new SaleNormal();
        context.setSale(sale1);
        context.pay(90);

        Sale sale2 = new SaleRebate(7.5);
        context.setSale(sale2);
        context.pay(90);

        Sale sale3 = new SaleDiscount(50, 10);
        context.setSale(sale3);
        context.pay(90);
    }
}
