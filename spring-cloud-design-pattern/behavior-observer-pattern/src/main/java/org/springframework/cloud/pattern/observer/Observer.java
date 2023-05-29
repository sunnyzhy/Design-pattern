package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:56
 */
public interface Observer {
    void update(String message);
}
