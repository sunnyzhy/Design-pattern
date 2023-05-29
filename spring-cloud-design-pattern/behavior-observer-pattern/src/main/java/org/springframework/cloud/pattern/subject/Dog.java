package org.springframework.cloud.pattern.subject;

import org.springframework.cloud.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Dog implements Observer, Subject {
    private STATE state;

    private List<Observer> observerList;

    public Dog() {
        this.state = STATE.SLEEP;
        this.observerList = new ArrayList<>();
        System.out.println(this.state.name);
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
        this.state = STATE.WOOF;
        System.out.println(message + " ---> " + this.state.name);
        notify(this.state.name);
    }

    enum STATE {
        SLEEP("狗在睡觉"),
        WOOF("狗：汪汪");

        private String name;

        STATE(String name) {
            this.name = name;
        }
    }
}
