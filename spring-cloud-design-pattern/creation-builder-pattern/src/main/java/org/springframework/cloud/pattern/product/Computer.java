package org.springframework.cloud.pattern.product;

/**
 * @author zhy
 * @date 2023/5/6 14:02
 */
public class Computer {
    private String CPU;
    private String memory;
    private String motherboard;
    private String hardDisk;


    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
}
