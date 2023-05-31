package org.springframework.cloud.pattern.originator;

import org.springframework.cloud.pattern.memento.RoleStateMemento;
import org.springframework.cloud.pattern.state.Location;

/**
 * @author zhy
 * @date 2023/5/31 11:47
 */
public class RoleState {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public RoleStateMemento createMemento() {
        return new RoleStateMemento(this.location);
    }

    public void restoreMemento(RoleStateMemento memento) {
        this.setLocation(memento.getLocation());
    }
}
