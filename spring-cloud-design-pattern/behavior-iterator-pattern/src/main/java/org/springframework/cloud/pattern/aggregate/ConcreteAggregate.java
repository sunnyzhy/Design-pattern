package org.springframework.cloud.pattern.aggregate;

import org.springframework.cloud.pattern.iterator.ConcreteIterator;
import org.springframework.cloud.pattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/30 14:37
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(list);
    }
}
