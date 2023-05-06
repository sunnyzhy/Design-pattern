package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.concrete.builder.GameComputerBuilder;
import org.springframework.cloud.pattern.concrete.builder.OfficeComputerBuilder;
import org.springframework.cloud.pattern.director.ComputerDirector;
import org.springframework.cloud.pattern.product.Computer;

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
}
