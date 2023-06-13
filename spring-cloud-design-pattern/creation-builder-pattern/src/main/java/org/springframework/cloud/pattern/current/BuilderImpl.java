package org.springframework.cloud.pattern.current;

/**
 * @author zhy
 * @date 2023/6/13 16:39
 */
public class BuilderImpl implements Builder {
    String cpu;
    String memory;
    String motherboard;
    String hardDisk;

    @Override
    public Builder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public Builder memory(String memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public Builder motherBoard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    @Override
    public Builder hardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    @Override
    public Computer build() {
        return Computer.create(this);
    }
}
