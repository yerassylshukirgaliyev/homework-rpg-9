package com.narxoz.rpg.artifact;

public abstract class Artifact {
    private String name;
    private int level;

    public Artifact(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public abstract void accept(ArtifactVisitor visitor);
}
