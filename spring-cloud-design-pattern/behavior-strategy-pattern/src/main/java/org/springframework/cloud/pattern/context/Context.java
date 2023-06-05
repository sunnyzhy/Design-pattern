package org.springframework.cloud.pattern.context;

import org.springframework.cloud.pattern.strategy.Sale;

/**
 * @author zhy
 * @date 2023/6/5 16:53
 */
public class Context {
    private Sale sale;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public double pay(double price) {
        return this.sale.pay(price);
    }
}
