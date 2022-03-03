package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.Keyboard;

/**
 * @author zhy
 * @date 2022/3/3 8:59
 */
public interface KeyboardFactory {
    Keyboard produce();
}
