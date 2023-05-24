package org.springframework.cloud.pattern.component;

/**
 * @author zhy
 * @date 2023/5/24 15:02
 */
public class Coffee implements Drink {
    @Override
    public String info() {
        return "咖啡";
    }
}
