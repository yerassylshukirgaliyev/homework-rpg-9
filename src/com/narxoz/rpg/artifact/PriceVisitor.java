package com.narxoz.rpg.artifact;

public class PriceVisitor implements ArtifactVisitor {
    private int total;

    public void visit(Weapon weapon) {
        total += weapon.getLevel() * 30 + weapon.getDamage() * 4;
    }

    public void visit(Potion potion) {
        total += potion.getLevel() * 10 + potion.getHeal() * 2;
    }

    public void visit(Scroll scroll) {
        total += scroll.getLevel() * 25 + scroll.getManaCost() * 3;
    }

    public void visit(Ring ring) {
        total += ring.getLevel() * 60 + ring.getBonus().length() * 5;
    }

    public void visit(Armor armor) {
        total += armor.getLevel() * 35 + armor.getArmor() * 5;
    }

    public int getTotal() {
        return total;
    }
}
