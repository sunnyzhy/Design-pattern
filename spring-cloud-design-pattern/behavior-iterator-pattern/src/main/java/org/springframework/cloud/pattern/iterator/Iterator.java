package org.springframework.cloud.pattern.iterator;

/**
 * @author zhy
 * @date 2023/5/30 14:36
 */
public interface Iterator<T> {
    T first();

    T next();

    boolean hasNext();
}
