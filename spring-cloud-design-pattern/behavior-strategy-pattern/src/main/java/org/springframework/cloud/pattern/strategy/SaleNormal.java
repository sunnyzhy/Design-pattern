package org.springframework.cloud.pattern.strategy;

/**
 * @author zhy
 * @date 2023/6/5 16:44
 */
public class SaleNormal implements Sale {
    @Override
    public double pay(double price) {
        System.out.println("正常收费 " + price + " 元");
        return price;
    }
}
