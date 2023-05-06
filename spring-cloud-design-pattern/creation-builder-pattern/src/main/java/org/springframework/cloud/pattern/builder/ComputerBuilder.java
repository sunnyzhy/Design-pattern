package org.springframework.cloud.pattern.builder;

import org.springframework.cloud.pattern.product.Computer;

/**
 * @author zhy
 * @date 2023/5/6 14:04
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();


    public abstract void buildMemory();

    public abstract void buildMotherboard();

    public abstract void buildHardDisk();

    public abstract Computer getComputer();
}
