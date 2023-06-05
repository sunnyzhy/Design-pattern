package org.springframework.cloud.pattern.strategy;

/**
 * @author zhy
 * @date 2023/6/5 16:44
 */
public class SaleDiscount implements Sale {
    private double condition;
    private double discount;

    public SaleDiscount(double condition, double discount) {
        this.condition = condition;
        this.discount = discount;
    }

    @Override
    public double pay(double price) {
        if (price < this.condition) {
            return price;
        }
        price = price - this.discount;
        System.out.println("满 " + condition + " 元减 " + discount + "元，收费 " + price + " 元");
        return price;
    }
}
