package org.springframework.cloud.pattern.subject;

import org.springframework.cloud.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Cat implements Observer, Subject {
    private List<Observer> observerList;

    private String behavior;

    public Cat(String behavior) {
        this.behavior = behavior;
        this.observerList = new ArrayList<>();
    }

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

    @Override
    public void operation(String message) {
        System.out.println(message + " ---> " + this.behavior);
        notify(this.behavior);
    }
}
