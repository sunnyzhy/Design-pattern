package org.springframework.cloud.pattern.element;

import org.springframework.cloud.pattern.visitor.Visitor;

import java.util.Random;

/**
 * @author zhy
 * @date 2023/6/6 13:48
 */
public abstract class Employee {
    private String name;
    private int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(100);
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    public abstract void accept(Visitor visitor);
}
