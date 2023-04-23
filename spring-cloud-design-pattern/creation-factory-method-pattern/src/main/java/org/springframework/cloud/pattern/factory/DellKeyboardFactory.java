package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.DellKeyboard;
import org.springframework.cloud.pattern.product.Keyboard;

/**
 * @author zhy
 * @date 2022/3/3 9:00
 */
public class DellKeyboardFactory implements KeyboardFactory {
    @Override
    public Keyboard produce() {
        return new DellKeyboard();
    }
}
