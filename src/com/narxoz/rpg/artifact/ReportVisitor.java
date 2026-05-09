package com.narxoz.rpg.artifact;

public class ReportVisitor implements ArtifactVisitor {
    private String text = "";

    public void visit(Weapon weapon) {
        text += "Weapon: " + weapon.getName() + ", dmg " + weapon.getDamage() + "\n";
    }

    public void visit(Potion potion) {
        text += "Potion: " + potion.getName() + ", heal " + potion.getHeal() + "\n";
    }

    public void visit(Scroll scroll) {
        text += "Scroll: " + scroll.getName() + ", spell " + scroll.getSpell() + "\n";
    }

    public void visit(Ring ring) {
        text += "Ring: " + ring.getName() + ", bonus " + ring.getBonus() + "\n";
    }

    public void visit(Armor armor) {
        text += "Armor: " + armor.getName() + ", armor " + armor.getArmor() + "\n";
    }

    public String getText() {
        return text;
    }
}
