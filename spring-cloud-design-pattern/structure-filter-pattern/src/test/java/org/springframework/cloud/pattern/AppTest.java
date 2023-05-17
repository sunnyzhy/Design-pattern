package org.springframework.cloud.pattern;

import lombok.Getter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.filter.Filter;
import org.springframework.cloud.pattern.filter.FilterImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Filter<Integer> numberFilter = new FilterImpl<>();
        List<Integer> numberList = numberFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(numberList);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 20));
        students.add(new Student("Jim", 23));
        students.add(new Student("Kate", 22));
        Filter<Student> studentFilter = new FilterImpl<>();
        List<Student> studentList = studentFilter.filter(students, n -> n.getAge() > 22);
        System.out.println(studentList);
    }

    @Getter
    class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
