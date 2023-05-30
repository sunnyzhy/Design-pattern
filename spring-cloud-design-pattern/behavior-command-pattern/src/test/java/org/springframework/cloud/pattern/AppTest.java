package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.command.CancelCommand;
import org.springframework.cloud.pattern.command.Command;
import org.springframework.cloud.pattern.command.CreateCommand;
import org.springframework.cloud.pattern.command.PayCommand;
import org.springframework.cloud.pattern.invoker.Processor;
import org.springframework.cloud.pattern.receiver.Order;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Order order = new Order();
        Command createCommand = new CreateCommand(order);
        Command payCommand = new PayCommand(order);
        Command cancelCommand = new CancelCommand(order);
        Processor processor = new Processor();
        processor.addCommand(createCommand);
        processor.addCommand(payCommand);
        processor.process();
        processor.addCommand(createCommand);
        processor.addCommand(cancelCommand);
        processor.process();
    }
}
