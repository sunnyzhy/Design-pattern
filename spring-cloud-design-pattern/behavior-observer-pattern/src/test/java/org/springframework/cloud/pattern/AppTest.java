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
        Cat cat = new Cat();
        Dog dog = new Dog();
        Baby baby = new Baby();
        Master master = new Master();

        mouse.add(cat);
        cat.add(dog);
        dog.add(baby);
        dog.add(master);

        System.out.println("==========");
        mouse.notify("老鼠跑");
    }
}
