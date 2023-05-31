package org.springframework.cloud.pattern.memento;

import org.springframework.cloud.pattern.state.Location;

/**
 * @author zhy
 * @date 2023/5/31 11:47
 */
public class RoleStateMemento {
    private Location location;

    public RoleStateMemento(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
