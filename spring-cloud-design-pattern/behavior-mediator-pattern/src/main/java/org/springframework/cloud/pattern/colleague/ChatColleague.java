package org.springframework.cloud.pattern.colleague;

import org.springframework.cloud.pattern.mediator.ChatMediator;

/**
 * @author zhy
 * @date 2023/5/31 9:26
 */
public abstract class ChatColleague {
    protected ChatMediator chatMediator;
    protected String name;

    public ChatColleague(String name) {
        this.name = name;
    }

    public void setMedium(ChatMediator chatServer) {
        this.chatMediator = chatServer;
    }

    public abstract void receive(String message);

    public abstract void send(String message);
}
