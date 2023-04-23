package org.springframework.cloud.pattern.product;

/**
 * @author zhy
 * @date 2022/3/1 17:52
 */
public class LenovoKeyboard implements Keyboard {
    @Override
    public void display() {
        System.out.println("这是一个联想键盘.");
    }
}
