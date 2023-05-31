package org.springframework.cloud.pattern.colleague;

/**
 * @author zhy
 * @date 2023/5/31 9:38
 */
public class ChatClient extends ChatColleague {
    public ChatClient(String name) {
        super(name);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " 收到一条消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " 发送一条消息：" + message);
        this.chatMediator.relay(this, message);
    }
}
