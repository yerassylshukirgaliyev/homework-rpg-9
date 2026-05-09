package com.narxoz.rpg.artifact;

public class Armor extends Artifact {
    private int armor;

    public Armor(String name, int level, int armor) {
        super(name, level);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
