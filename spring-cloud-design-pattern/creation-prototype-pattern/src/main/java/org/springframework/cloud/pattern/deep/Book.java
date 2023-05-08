package org.springframework.cloud.pattern.deep;

import java.io.*;

/**
 * @author zhy
 * @date 2023/5/8 10:34
 */
public class Book implements Serializable, Cloneable {
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
        Book book = null;
        try {
            // 序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            book = (Book) ois.readObject();

            bos.close();
            oos.close();
            bis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return book;
    }
}
