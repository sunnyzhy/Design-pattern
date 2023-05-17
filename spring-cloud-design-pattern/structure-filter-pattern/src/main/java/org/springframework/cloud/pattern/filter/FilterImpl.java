package org.springframework.cloud.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhy
 * @date 2023/5/17 14:34
 */
public class FilterImpl<T> implements Filter<T> {
    @Override
    public List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                list.add(item);
            }
        }
        return list;
    }
}
