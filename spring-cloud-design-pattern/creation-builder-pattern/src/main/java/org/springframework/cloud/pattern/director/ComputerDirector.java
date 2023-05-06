package org.springframework.cloud.pattern.director;

import org.springframework.cloud.pattern.builder.ComputerBuilder;
import org.springframework.cloud.pattern.product.Computer;

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
