package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.component.Coffee;
import org.springframework.cloud.pattern.component.Drink;
import org.springframework.cloud.pattern.decorator.Milk;
import org.springframework.cloud.pattern.decorator.Sugar;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Drink drink = new Coffee();
        System.out.println(drink.info());
        Sugar sugar = new Sugar(drink);
        System.out.println(sugar.info());
        Milk milk = new Milk(drink);
        System.out.println(milk.info());
        milk = new Milk(sugar);
        System.out.println(milk.info());
    }
}
