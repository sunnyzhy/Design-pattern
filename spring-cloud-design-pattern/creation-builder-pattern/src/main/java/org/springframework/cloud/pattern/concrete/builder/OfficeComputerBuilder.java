package org.springframework.cloud.pattern.concrete.builder;

import org.springframework.cloud.pattern.builder.ComputerBuilder;
import org.springframework.cloud.pattern.product.Computer;

/**
 * @author zhy
 * @date 2023/5/6 14:05
 */
public class OfficeComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCPU("intel core i3");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("ASUS");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("2TB SSD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
