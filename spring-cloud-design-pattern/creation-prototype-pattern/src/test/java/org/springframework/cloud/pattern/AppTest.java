package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.shallow.Book;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void testShallow() throws CloneNotSupportedException {
        Book book = new Book();
        book.setName("java");
        book.setAuthor(new String[]{"a", "b"});
        Book book1 = book.clone();
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
        book.setName("c++");
        book.getAuthor()[1] = "c";
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
        book1.setName("c#");
        book1.getAuthor()[1] = "d";
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
    }

    @Test
    void testDeep() throws CloneNotSupportedException {
        org.springframework.cloud.pattern.deep.Book book = new org.springframework.cloud.pattern.deep.Book();
        book.setName("java");
        book.setAuthor(new String[]{"a", "b"});
        org.springframework.cloud.pattern.deep.Book book1 = book.clone();
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
        book.setName("c++");
        book.getAuthor()[1] = "c";
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
        book1.setName("c#");
        book1.getAuthor()[1] = "d";
        System.out.println("book's  name: " + book.getName() + "\tauthor: " + String.join(",", book.getAuthor()));
        System.out.println("book1's name: " + book1.getName() + "\tauthor: " + String.join(",", book1.getAuthor()));
    }
}
