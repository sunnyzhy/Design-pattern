package org.springframework.cloud.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.pattern.client.Client1;

/**
 * @author zhy
 * @date 2022/3/3 8:53
 */
@SpringBootApplication
public class FacadePatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacadePatternApplication.class, args);

        Client1 client1 = new Client1();
        client1.method();
    }
}
