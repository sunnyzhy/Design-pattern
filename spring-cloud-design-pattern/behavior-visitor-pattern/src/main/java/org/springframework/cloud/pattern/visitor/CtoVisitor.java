package org.springframework.cloud.pattern.visitor;

import org.springframework.cloud.pattern.element.Manager;
import org.springframework.cloud.pattern.element.Engineer;

/**
 * @author zhy
 * @date 2023/6/6 14:00
 */
public class CtoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", 产品数量: " + manager.getProducts());
    }
}
