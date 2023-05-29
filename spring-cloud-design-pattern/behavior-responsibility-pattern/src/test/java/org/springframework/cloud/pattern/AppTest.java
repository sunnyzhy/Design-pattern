package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.handler.ClassApprover;
import org.springframework.cloud.pattern.handler.CollegeApprover;
import org.springframework.cloud.pattern.handler.DepartmentApprover;
import org.springframework.cloud.pattern.handler.Approver;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Approver classApprover = new ClassApprover("班主任");
        Approver departmentApprover = new DepartmentApprover("系主任");
        Approver collegeApprover = new CollegeApprover("院长");
        classApprover.setNext(departmentApprover);
        departmentApprover.setNext(collegeApprover);

        classApprover.process(18);
    }
}
