package org.springframework.cloud.pattern.mediator;

import org.springframework.cloud.pattern.colleague.ChatColleague;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @date 2023/5/31 9:35
 */
public class ChatServer implements ChatMediator {
    List<ChatColleague> clientList = new ArrayList<>();

    @Override
    public void register(ChatColleague client) {
        if (client != null && !clientList.contains(client)) {
            client.setMedium(this);
            clientList.add(client);
        }
    }

    @Override
    public void relay(ChatColleague client, String message) {
        for (ChatColleague c : clientList) {
            if (!client.equals(c)) {
                c.receive(message);
            }
        }
    }
}
