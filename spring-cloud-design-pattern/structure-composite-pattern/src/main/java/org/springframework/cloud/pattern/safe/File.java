package org.springframework.cloud.pattern.safe;

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
    public String getName() {
        return "文件: " + this.name;
    }

    @Override
    public void operation() {
        throw new UnsupportedOperationException();
    }
}
