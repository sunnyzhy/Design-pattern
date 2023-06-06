package org.springframework.cloud.pattern.element;

import org.springframework.cloud.pattern.visitor.Visitor;

import java.util.Random;

/**
 * @author zhy
 * @date 2023/6/6 13:57
 */
public class Manager extends Employee {
    private String name;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标: 产品数量
     *
     * @return
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
