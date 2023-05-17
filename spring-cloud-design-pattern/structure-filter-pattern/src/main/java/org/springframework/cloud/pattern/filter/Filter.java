package org.springframework.cloud.pattern.filter;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhy
 * @date 2023/5/17 14:34
 */
public interface Filter<T> {
    List<T> filter(List<T> items, Predicate<T> predicate);
}
