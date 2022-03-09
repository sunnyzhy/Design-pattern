package org.springframework.cloud.pattern.facade;

import org.springframework.cloud.pattern.sub.SubSystemA;
import org.springframework.cloud.pattern.sub.SubSystemB;
import org.springframework.cloud.pattern.sub.SubSystemC;

/**
 * @author zhy
 * @date 2022/3/4 17:31
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
        this.subSystemC = new SubSystemC();
    }

    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
