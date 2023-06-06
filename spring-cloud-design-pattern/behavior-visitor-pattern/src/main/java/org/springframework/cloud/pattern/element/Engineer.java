package org.springframework.cloud.pattern.element;

import org.springframework.cloud.pattern.visitor.Visitor;

import java.util.Random;

/**
 * @author zhy
 * @date 2023/6/6 13:57
 */
public class Engineer extends Employee {
    private String name;

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标: 代码量
     *
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
