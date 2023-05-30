package org.springframework.cloud.pattern.iterator;

import java.util.List;

/**
 * @author zhy
 * @date 2023/5/30 14:39
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private int index = -1;
    private List<T> list;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        index = 0;
        T t = list.get(index);
        return t;
    }

    @Override
    public T next() {
        T t = null;
        if (this.hasNext()) {
            t = list.get(++index);
        }
        return t;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
