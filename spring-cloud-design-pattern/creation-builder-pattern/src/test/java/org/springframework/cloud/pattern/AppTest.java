package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.tradition.builder.GameComputerBuilder;
import org.springframework.cloud.pattern.tradition.builder.OfficeComputerBuilder;
import org.springframework.cloud.pattern.tradition.director.ComputerDirector;
import org.springframework.cloud.pattern.tradition.product.Computer;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        ComputerDirector computerDirector = new ComputerDirector(new GameComputerBuilder());
        Computer gameComputer = computerDirector.construct();
        System.out.println(gameComputer);

        ComputerDirector computerDirector1 = new ComputerDirector(new OfficeComputerBuilder());
        Computer officeComputer = computerDirector1.construct();
        System.out.println(officeComputer);
    }

    @Test
    void test2() {
        org.springframework.cloud.pattern.current.Computer computer = org.springframework.cloud.pattern.current.Computer.newBuilder()
                .cpu("intel core i3")
                .memory("16GB")
                .motherBoard("ASUS")
                .hardDisk("2TB SSD")
                .build();
        System.out.println(computer);
    }
}
