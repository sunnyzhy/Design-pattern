package org.springframework.cloud.pattern.subject;

import org.springframework.cloud.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/26 14:56
 */
public class Mouse implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : this.observerList) {
            observer.operation(message);
        }
    }
}
