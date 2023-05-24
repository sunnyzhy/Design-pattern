package org.springframework.cloud.pattern.decorator;

import org.springframework.cloud.pattern.component.Drink;

/**
 * @author zhy
 * @date 2023/5/24 15:04
 */
public abstract class Decorator implements Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String info() {
        return drink.info();
    }
}
