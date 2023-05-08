package org.springframework.cloud.pattern.shallow;

/**
 * @author zhy
 * @date 2023/5/8 10:34
 */
public class Book implements Cloneable {
    private String name;
    private String[] author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
