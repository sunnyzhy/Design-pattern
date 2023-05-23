package org.springframework.cloud.pattern.transparent;

/**
 * @author zhy
 * @date 2023/5/22 17:57
 */
public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return "文件: " + this.name;
    }

    @Override
    public void operation() {
        throw new UnsupportedOperationException();
    }
}
