package org.springframework.cloud.pattern.flyweight;

/**
 * @author zhy
 * @date 2023/5/25 11:41
 */
public enum Color {
    WHITE(0, "白棋"),
    BLACK(1, "黑棋");

    private Integer code;
    private String name;

    Color(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
