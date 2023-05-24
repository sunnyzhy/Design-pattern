package org.springframework.cloud.pattern.decorator;

import org.springframework.cloud.pattern.component.Drink;

/**
 * @author zhy
 * @date 2023/5/24 15:13
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String info() {
        return super.info() + "加牛奶";
    }
}
