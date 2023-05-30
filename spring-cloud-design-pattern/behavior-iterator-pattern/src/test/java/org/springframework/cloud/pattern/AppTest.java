package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.aggregate.Aggregate;
import org.springframework.cloud.pattern.aggregate.ConcreteAggregate;
import org.springframework.cloud.pattern.iterator.Iterator;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        Iterator<String> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.println(it);
        }
        String it = iterator.first();
        System.out.println(it);
    }
}
