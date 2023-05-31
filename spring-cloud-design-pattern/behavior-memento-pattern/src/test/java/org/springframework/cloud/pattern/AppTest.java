package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.cloud.pattern.caretaker.RoleStateCaretaker;
import org.springframework.cloud.pattern.originator.RoleState;
import org.springframework.cloud.pattern.state.Location;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void test() {
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        RoleState state = new RoleState();

        state.setLocation(new Location(0, 0));
        caretaker.addMemento(state.createMemento());
        System.out.println("角色初始位置：" + state.getLocation().getX() + "," + state.getLocation().getY());
        state.setLocation(new Location(1, 1));
        caretaker.addMemento(state.createMemento());
        System.out.println("角色行进至：" + state.getLocation().getX() + "," + state.getLocation().getY());
        state.setLocation(new Location(2, 2));
        System.out.println("角色行进至：" + state.getLocation().getX() + "," + state.getLocation().getY());

        System.out.println();
        state.restoreMemento(caretaker.getMemento(1));
        System.out.println("角色回退至：" + state.getLocation().getX() + "," + state.getLocation().getY());
        state.restoreMemento(caretaker.getMemento(0));
        System.out.println("角色回退至：" + state.getLocation().getX() + "," + state.getLocation().getY());
    }
}
