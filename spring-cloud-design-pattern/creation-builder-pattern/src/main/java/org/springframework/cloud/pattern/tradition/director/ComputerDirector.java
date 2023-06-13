package org.springframework.cloud.pattern.tradition.director;

import org.springframework.cloud.pattern.tradition.builder.ComputerBuilder;
import org.springframework.cloud.pattern.tradition.product.Computer;

/**
 * @author zhy
 * @date 2023/5/6 14:08
 */
public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildMotherboard();
        builder.buildCpu();
        builder.buildMemory();
        builder.buildHardDisk();
        Computer product = builder.getComputer();
        return product;
    }
}
