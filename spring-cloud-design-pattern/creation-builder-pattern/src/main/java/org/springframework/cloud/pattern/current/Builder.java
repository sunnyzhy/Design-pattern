package org.springframework.cloud.pattern.current;

/**
 * @author zhy
 * @date 2023/6/13 16:38
 */
public interface Builder {
    Builder cpu(String cpu);

    Builder memory(String memory);

    Builder motherBoard(String motherboard);

    Builder hardDisk(String hardDisk);

    Computer build();
}
