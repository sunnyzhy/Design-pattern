package org.springframework.cloud.pattern.subject;

import org.springframework.cloud.pattern.observer.Observer;

/**
 * @author zhy
 * @date 2023/5/26 14:55
 */
public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void notify(String message);
}
