package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.product.keyboard.DellKeyboard;
import org.springframework.cloud.pattern.product.keyboard.Keyboard;
import org.springframework.cloud.pattern.product.monitor.DellMonitor;
import org.springframework.cloud.pattern.product.monitor.Monitor;
import org.springframework.cloud.pattern.product.mouse.DellMouse;
import org.springframework.cloud.pattern.product.mouse.Mouse;

/**
 * @author zhy
 * @date 2022/3/3 9:40
 */
public class DellFactory implements Factory {
    @Override
    public Keyboard produceKeyboard() {
        Keyboard keyboard = new DellKeyboard();
        keyboard.input();
        return keyboard;
    }

    @Override
    public Monitor produceMonitor() {
        Monitor monitor = new DellMonitor();
        monitor.display();
        return monitor;
    }

    @Override
    public Mouse produceMouse() {
        Mouse mouse = new DellMouse();
        mouse.click();
        return mouse;
    }
}
