package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.Keyboard;
import org.springframework.cloud.pattern.product.LenovoKeyboard;

/**
 * @author zhy
 * @date 2022/3/3 9:01
 */
public class LenovoKeyboardFactory implements KeyboardFactory {
    @Override
    public Keyboard produce() {
        return new LenovoKeyboard();
    }
}
