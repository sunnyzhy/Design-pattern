package org.springframework.cloud.pattern.command;

import org.springframework.cloud.pattern.receiver.Order;

/**
 * @author zhy
 * @date 2023/5/29 17:12
 */
public class CreateCommand implements Command {
    private Order order;

    public CreateCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.create();
    }
}
