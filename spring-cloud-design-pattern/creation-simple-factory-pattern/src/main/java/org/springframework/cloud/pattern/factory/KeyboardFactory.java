package org.springframework.cloud.pattern.factory;

import lombok.Data;
import org.springframework.cloud.pattern.resource.KeyboardType;
import org.springframework.cloud.pattern.product.DellKeyboard;
import org.springframework.cloud.pattern.product.LenovoKeyboard;
import org.springframework.cloud.pattern.product.Keyboard;

/**
 * @author zhy
 * @date 2022/3/1 17:52
 */
@Data
public class KeyboardFactory {
    public Keyboard produce(int code) {
        Keyboard keyboard = null;
        if (KeyboardType.Dell.getCode() == code) {
            keyboard = new DellKeyboard();
        } else if (KeyboardType.Lenovo.getCode() == code) {
            keyboard = new LenovoKeyboard();
        }
        return keyboard;
    }
}
