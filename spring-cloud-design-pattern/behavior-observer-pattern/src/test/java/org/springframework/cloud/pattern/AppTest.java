package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.observer.Baby;
import org.springframework.cloud.pattern.observer.Master;
import org.springframework.cloud.pattern.subject.Cat;
import org.springframework.cloud.pattern.subject.Dog;
import org.springframework.cloud.pattern.subject.Mouse;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        Mouse mouse = new Mouse();
        Cat cat = new Cat("猫：喵呜");
        Dog dog = new Dog("狗：汪汪");
        Baby baby = new Baby("婴儿哭");
        Master master = new Master("主人醒");

        mouse.add(cat);
        cat.add(dog);
        dog.add(baby);
        dog.add(master);

        mouse.notify("老鼠跑");
    }
}
