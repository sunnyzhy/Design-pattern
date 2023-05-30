package org.springframework.cloud.pattern.expression;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/5/30 10:29
 */
public interface AbstractExpression {
    int interpreter(Context context);

    String toString();
}
