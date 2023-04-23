package org.springframework.cloud.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.pattern.factory.DellFactory;
import org.springframework.cloud.pattern.factory.Factory;

/**
 * @author zhy
 * @date 2022/3/3 8:53
 */
@SpringBootApplication
public class AbstractFactoryPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryPatternApplication.class, args);

        Factory factory = new DellFactory();
        factory.produceKeyboard();
        factory.produceMonitor();
        factory.produceMouse();
    }
}
