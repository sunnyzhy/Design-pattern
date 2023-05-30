package org.springframework.cloud.pattern.invoker;

import org.springframework.cloud.pattern.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/29 18:03
 */
public class Processor {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void process() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
