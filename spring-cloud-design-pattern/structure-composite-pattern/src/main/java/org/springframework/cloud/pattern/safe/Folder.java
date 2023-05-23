package org.springframework.cloud.pattern.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/23 8:58
 */
public class Folder implements Component {
    private String name;
    private List<Component> componentList = new ArrayList<Component>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public Component getChild(int i) {
        return this.componentList.get(i);
    }

    @Override
    public String getName() {
        return "文件夹: " + this.name;
    }

    @Override
    public void operation() {
        for (Component component : componentList) {
            System.out.println(component.getName());
            component.operation();
        }
    }
}
