package org.springframework.cloud.pattern.visitor;

import org.springframework.cloud.pattern.element.Manager;
import org.springframework.cloud.pattern.element.Engineer;

/**
 * @author zhy
 * @date 2023/6/6 13:58
 */
public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
