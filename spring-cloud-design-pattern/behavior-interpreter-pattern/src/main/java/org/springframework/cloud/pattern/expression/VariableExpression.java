package org.springframework.cloud.pattern.expression;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/5/30 10:31
 */
public class VariableExpression implements AbstractExpression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpreter(Context context) {
        return context.lookup(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
