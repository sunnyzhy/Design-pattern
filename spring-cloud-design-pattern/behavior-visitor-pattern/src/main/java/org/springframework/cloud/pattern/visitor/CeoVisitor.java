package org.springframework.cloud.pattern.visitor;

import org.springframework.cloud.pattern.element.Engineer;
import org.springframework.cloud.pattern.element.Manager;

/**
 * @author zhy
 * @date 2023/6/6 14:00
 */
public class CeoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", KPI: " + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", KPI: " + manager.getKpi() + ", 新产品数量: " + manager.getProducts());
    }
}
