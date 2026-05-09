package com.narxoz.rpg.artifact;

public class Ring extends Artifact {
    private String bonus;

    public Ring(String name, int level, String bonus) {
        super(name, level);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
