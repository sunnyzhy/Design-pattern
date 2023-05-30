package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.context.Context;
import org.springframework.cloud.pattern.expression.AbstractExpression;
import org.springframework.cloud.pattern.expression.PlusExpression;
import org.springframework.cloud.pattern.expression.VariableExpression;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Context context = new Context();
        AbstractExpression a = new VariableExpression("a");
        AbstractExpression b = new VariableExpression("b");
        AbstractExpression c = new VariableExpression("c");

        context.addExp(a, 6);
        context.addExp(b, 8);
        context.addExp(c, 16);

        System.out.println(a + " = " + a.interpreter(context));
        System.out.println(b + " = " + b.interpreter(context));
        System.out.println(c + " = " + c.interpreter(context));

        AbstractExpression e1 = new PlusExpression(a, b);
        int v1 = e1.interpreter(context);
        System.out.println(e1 + " = " + v1);

        AbstractExpression e2 = new PlusExpression(e1, c);
        int v2 = e2.interpreter(context);
        System.out.println(e2 + " = " + v2);
    }
}
