package org.springframework.cloud.pattern.decorator;

import org.springframework.cloud.pattern.component.Drink;

/**
 * @author zhy
 * @date 2023/5/24 15:13
 */
public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String info() {
        return super.info() + "加糖";
    }
}
