package org.springframework.cloud.pattern.mediator;

import org.springframework.cloud.pattern.colleague.ChatColleague;

/**
 * @author zhy
 * @date 2023/5/31 9:25
 */
public interface ChatMediator {
    void register(ChatColleague client);

    void relay(ChatColleague client, String message);
}
