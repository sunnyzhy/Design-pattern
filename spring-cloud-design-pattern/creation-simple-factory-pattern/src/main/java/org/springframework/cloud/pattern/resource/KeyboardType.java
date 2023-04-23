package org.springframework.cloud.pattern.resource;

/**
 * @author zhy
 * @date 2022/3/2 15:17
 */
public enum KeyboardType {
    Dell(1, "Dell"),
    Lenovo(2, "Lenovo");

    private int code;
    private String name;

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    KeyboardType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
