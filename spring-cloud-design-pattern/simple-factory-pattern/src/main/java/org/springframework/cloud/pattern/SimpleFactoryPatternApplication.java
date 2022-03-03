package org.springframework.cloud.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.pattern.product.Keyboard;
import org.springframework.cloud.pattern.factory.KeyboardFactory;
import org.springframework.cloud.pattern.resource.KeyboardType;

/**
 * @author zhy
 * @date 2022/3/1 17:52
 */
@SpringBootApplication
public class SimpleFactoryPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryPatternApplication.class, args);

        KeyboardFactory keyboardFactory = new KeyboardFactory();
        Keyboard keyboard = keyboardFactory.produce(KeyboardType.Dell.getCode());
        if (keyboard != null) {
            keyboard.display();
        }
    }
}
