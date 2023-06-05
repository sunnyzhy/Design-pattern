package org.springframework.cloud.pattern.strategy;

/**
 * @author zhy
 * @date 2023/6/5 16:44
 */
public class SaleRebate implements Sale {
    private double rebate = 1.0;

    public SaleRebate(double rebate) {
        this.rebate = rebate / 10;
    }

    @Override
    public double pay(double price) {
        price = price * this.rebate;
        System.out.println("打 " + (this.rebate * 10) + " 折，收费 " + price + " 元");
        return price;
    }
}
