package vsu.cs.prinf.zolotareva.model;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}
