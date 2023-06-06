package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.element.Engineer;
import org.springframework.cloud.pattern.element.Manager;
import org.springframework.cloud.pattern.structure.BusinessReport;
import org.springframework.cloud.pattern.visitor.CeoVisitor;
import org.springframework.cloud.pattern.visitor.CtoVisitor;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        BusinessReport businessReport = new BusinessReport();
        businessReport.add(new Manager("经理-A"));
        businessReport.add(new Engineer("工程师-A"));
        businessReport.add(new Engineer("工程师-B"));
        businessReport.add(new Engineer("工程师-C"));
        businessReport.add(new Manager("经理-B"));

        System.out.println("=========== CTO看报表 ===========");
        businessReport.showReport(new CtoVisitor());
        System.out.println("=========== CEO看报表 ===========");
        businessReport.showReport(new CeoVisitor());
    }
}
