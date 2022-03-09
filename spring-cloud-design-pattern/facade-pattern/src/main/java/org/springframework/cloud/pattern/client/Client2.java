package org.springframework.cloud.pattern.client;

import org.springframework.cloud.pattern.facade.Facade;

/**
 * @author zhy
 * @date 2022/3/7 9:38
 */
public class Client2 {
    Facade facade;

    public Client2() {
        this.facade = new Facade();
    }

    public void method() {
        facade.method();
    }
}
