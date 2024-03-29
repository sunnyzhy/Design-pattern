package org.springframework.cloud.pattern.current;

/**
 * @author zhy
 * @date 2023/6/13 16:24
 */
public class Computer {
    private final String cpu;
    private final String memory;
    private final String motherboard;
    private final String hardDisk;

    /**
     * 私有构造函数
     * @param builder
     */
    private Computer(BuilderImpl builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.motherboard = builder.motherboard;
        this.hardDisk = builder.hardDisk;
    }

    public static Builder newBuilder() {
        return new BuilderImpl();
    }

    /**
     * package-private 函数，仅在本包中可见
     * @param builder
     * @return
     */
    static Computer create(BuilderImpl builder) {
        return new Computer(builder);
    }
}
