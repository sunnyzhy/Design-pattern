package org.springframework.cloud.pattern.structure;

import org.springframework.cloud.pattern.element.Employee;
import org.springframework.cloud.pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/6/6 15:17
 */
public class BusinessReport {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public void showReport(Visitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
