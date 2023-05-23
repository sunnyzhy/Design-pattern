package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void testTransparent() {
        org.springframework.cloud.pattern.transparent.Folder folder1 = new org.springframework.cloud.pattern.transparent.Folder("D:");
        org.springframework.cloud.pattern.transparent.Folder folder2 = new org.springframework.cloud.pattern.transparent.Folder("aa");
        folder1.add(folder2);
        org.springframework.cloud.pattern.transparent.Folder folder3 = new org.springframework.cloud.pattern.transparent.Folder("bb");
        folder2.add(folder3);
        org.springframework.cloud.pattern.transparent.File file = new org.springframework.cloud.pattern.transparent.File("cc.log");
        folder1.add(file);
        try {
            folder1.operation();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testSafe() {
        org.springframework.cloud.pattern.safe.Folder folder1 = new org.springframework.cloud.pattern.safe.Folder("D:");
        org.springframework.cloud.pattern.safe.Folder folder2 = new org.springframework.cloud.pattern.safe.Folder("aa");
        folder1.add(folder2);
        org.springframework.cloud.pattern.safe.Folder folder3 = new org.springframework.cloud.pattern.safe.Folder("bb");
        folder2.add(folder3);
        org.springframework.cloud.pattern.safe.File file = new org.springframework.cloud.pattern.safe.File("cc.log");
        folder1.add(file);
        try {
            folder1.operation();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
