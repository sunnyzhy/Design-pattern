package org.springframework.cloud.pattern.aggregate;

import org.springframework.cloud.pattern.iterator.Iterator;

/**
 * @author zhy
 * @date 2023/5/30 14:35
 */
public interface Aggregate<T> {
    void add(T t);
    void remove(T t);
    Iterator<T> getIterator();
}
