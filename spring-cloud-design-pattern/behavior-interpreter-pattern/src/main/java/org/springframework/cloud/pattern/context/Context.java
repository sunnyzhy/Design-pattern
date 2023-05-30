package org.springframework.cloud.pattern.context;

import org.springframework.cloud.pattern.expression.AbstractExpression;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhy
 * @date 2023/5/30 10:31
 */
public class Context {
    private Map<AbstractExpression, Integer> contextMap = new HashMap<>();

    public void addExp(AbstractExpression exp, Integer value) {
        contextMap.put(exp, value);
    }

    public Integer lookup(AbstractExpression exp) {
        return contextMap.get(exp);
    }
}
