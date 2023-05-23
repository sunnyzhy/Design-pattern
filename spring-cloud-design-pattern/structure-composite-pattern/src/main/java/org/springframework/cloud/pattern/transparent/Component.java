package org.springframework.cloud.pattern.transparent;

/**
 * @author zhy
 * @date 2023/5/22 17:56
 */
public interface Component {
    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    String getName();

    void operation();
}
