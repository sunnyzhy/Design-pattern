package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.keyboard.Keyboard;
import org.springframework.cloud.pattern.product.keyboard.LenovoKeyboard;
import org.springframework.cloud.pattern.product.monitor.LenovoMonitor;
import org.springframework.cloud.pattern.product.monitor.Monitor;
import org.springframework.cloud.pattern.product.mouse.LenovoMouse;
import org.springframework.cloud.pattern.product.mouse.Mouse;

/**
 * @author zhy
 * @date 2022/3/3 9:40
 */
public class LenovoFactory implements Factory {
    @Override
    public Keyboard produceKeyboard() {
        Keyboard keyboard = new LenovoKeyboard();
        keyboard.input();
        return keyboard;
    }

    @Override
    public Monitor produceMonitor() {
        Monitor monitor = new LenovoMonitor();
        monitor.display();
        return monitor;
    }

    @Override
    public Mouse produceMouse() {
        Mouse mouse = new LenovoMouse();
        mouse.click();
        return mouse;
    }
}
