package org.springframework.cloud.pattern.subject;

import org.springframework.cloud.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Dog implements Observer, Subject {
    private STATUS status;

    private List<Observer> observerList;

    public Dog() {
        this.status = STATUS.SLEEP;
        this.observerList = new ArrayList<>();
        System.out.println(this.status.name);
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
            observer.update(message);
        }
    }

    @Override
    public void update(String message) {
        this.status = STATUS.WOOF;
        System.out.println(message + " ---> " + this.status.name);
        notify(this.status.name);
    }

    enum STATUS {
        SLEEP("狗在睡觉"),
        WOOF("狗：汪汪");

        private String name;

        STATUS(String name) {
            this.name = name;
        }
    }
}
