package com.narxoz.rpg.artifact;

public class Potion extends Artifact {
    private int heal;

    public Potion(String name, int level, int heal) {
        super(name, level);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }

    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
