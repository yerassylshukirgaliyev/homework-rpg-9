package com.narxoz.rpg.artifact;

public class Scroll extends Artifact {
    private String spell;
    private int manaCost;

    public Scroll(String name, int level, String spell, int manaCost) {
        super(name, level);
        this.spell = spell;
        this.manaCost = manaCost;
    }

    public String getSpell() {
        return spell;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
