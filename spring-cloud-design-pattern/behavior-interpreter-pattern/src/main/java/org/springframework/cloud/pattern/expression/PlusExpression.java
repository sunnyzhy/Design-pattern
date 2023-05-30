package org.springframework.cloud.pattern.expression;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/5/30 10:35
 */
public class PlusExpression implements AbstractExpression {
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    public PlusExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpreter(Context context) {
        return leftExpression.interpreter(context) + rightExpression.interpreter(context);
    }

    @Override
    public String toString() {
        return leftExpression.toString() + " + " + rightExpression.toString();
    }
}
