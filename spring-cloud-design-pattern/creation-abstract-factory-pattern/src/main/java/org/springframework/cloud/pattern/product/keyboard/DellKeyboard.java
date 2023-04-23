package org.springframework.cloud.pattern.product.keyboard;

/**
 * @author zhy
 * @date 2022/3/1 17:52
 */
public class DellKeyboard implements Keyboard {

    @Override
    public void input() {
        System.out.println("戴尔键盘.");
    }
}
