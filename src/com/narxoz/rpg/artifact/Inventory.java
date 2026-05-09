package com.narxoz.rpg.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {
    private List<Artifact> items = new ArrayList<>();

    public void add(Artifact artifact) {
        items.add(artifact);
    }

    public void removeLast() {
        if (!items.isEmpty()) {
            items.remove(items.size() - 1);
        }
    }

    public List<Artifact> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void accept(ArtifactVisitor visitor) {
        for (Artifact item : items) {
            item.accept(visitor);
        }
    }

    public Inventory copy() {
        Inventory inventory = new Inventory();
        for (Artifact item : items) {
            inventory.add(item);
        }
        return inventory;
    }

    public String toString() {
        String s = "";
        for (Artifact a : items) {
            s += a.getName() + ", ";
        }
        if (s.length() > 1) {
            s = s.substring(0, s.length() - 2);
        }
        return s;
    }
}
