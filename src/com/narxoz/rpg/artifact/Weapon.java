package com.narxoz.rpg.artifact;

public class Weapon extends Artifact {
    private int damage;

    public Weapon(String name, int level, int damage) {
        super(name, level);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
