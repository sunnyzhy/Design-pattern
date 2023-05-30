package org.springframework.cloud.pattern.receiver;

import java.util.UUID;

/**
 * @author zhy
 * @date 2023/5/29 17:17
 */
public class Order {
    private String id;
    private STATUS status;

    public void create() {
        this.id = UUID.randomUUID().toString();
        this.status = STATUS.CREATED;
        System.out.println(this.status.name + "，订单号: " + this.id);
    }

    public void pay() {
        this.status = STATUS.PAYED;
        System.out.println("订单号 " + this.id + ": " + this.status.name);
    }

    public void cancel() {
        this.status = STATUS.CANCEL;
        System.out.println("订单号 " + this.id + ": " + this.status.name);
    }

    enum STATUS {
        CREATED("订单已创建"),
        PAYED("订单已支付"),
        CANCEL("取消订单");

        private String name;

        STATUS(String name) {
            this.name = name;
        }
    }
}
