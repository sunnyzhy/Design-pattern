package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.keyboard.Keyboard;
import org.springframework.cloud.pattern.product.monitor.Monitor;
import org.springframework.cloud.pattern.product.mouse.Mouse;

/**
 * @author zhy
 * @date 2022/3/3 9:39
 */
public interface Factory {
    Keyboard produceKeyboard();
    Monitor produceMonitor();
    Mouse produceMouse();
}
