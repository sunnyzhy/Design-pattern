package org.springframework.cloud.pattern.caretaker;

import org.springframework.cloud.pattern.memento.RoleStateMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/31 12:03
 */
public class RoleStateCaretaker {
    private List<RoleStateMemento> mementoList = new ArrayList<>();

    public RoleStateMemento getMemento(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        } else {
            return null;
        }
    }

    public void addMemento(RoleStateMemento memento) {
        mementoList.add(memento);
    }
}
