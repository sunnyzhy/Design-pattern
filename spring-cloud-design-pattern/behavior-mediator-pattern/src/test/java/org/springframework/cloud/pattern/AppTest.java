package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.colleague.ChatClient;
import org.springframework.cloud.pattern.colleague.ChatColleague;
import org.springframework.cloud.pattern.mediator.ChatMediator;
import org.springframework.cloud.pattern.mediator.ChatServer;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        ChatMediator mediator = new ChatServer();
        ChatColleague owen = new ChatClient("Owen");
        ChatColleague tom = new ChatClient("Tom");
        ChatColleague jim = new ChatClient("Jim");

        mediator.register(owen);
        mediator.register(tom);
        mediator.register(jim);

        owen.send("Hello!");
    }
}
