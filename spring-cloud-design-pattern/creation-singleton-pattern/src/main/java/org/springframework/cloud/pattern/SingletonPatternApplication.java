package org.springframework.cloud.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.pattern.lazy.safe.internal.code.Singleton;

/**
 * @author zhy
 * @date 2022/3/1 17:52
 */
@SpringBootApplication
public class SingletonPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(SingletonPatternApplication.class, args);

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
