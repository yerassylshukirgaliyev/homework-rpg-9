package com.narxoz.rpg.combatant;

import com.narxoz.rpg.artifact.Artifact;
import com.narxoz.rpg.artifact.Inventory;

public class Hero {
    private String name;
    private int hp;
    private int mana;
    private int gold;
    private Inventory inventory;

    public Hero(String name, int hp, int mana, int gold) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.gold = gold;
        inventory = new Inventory();
    }

    public void addArtifact(Artifact artifact) {
        inventory.add(artifact);
    }

    public void damage(int value) {
        hp -= value;
        if (hp < 0) {
            hp = 0;
        }
    }

    public void useMana(int value) {
        mana -= value;
        if (mana < 0) {
            mana = 0;
        }
    }

    public void addGold(int value) {
        gold += value;
    }

    public void loseGold(int value) {
        gold -= value;
        if (gold < 0) {
            gold = 0;
        }
    }

    public HeroMemento save() {
        return new HeroMemento(hp, mana, gold, inventory.copy());
    }

    public void restore(HeroMemento memento) {
        hp = memento.getHp();
        mana = memento.getMana();
        gold = memento.getGold();
        inventory = memento.getInventory().copy();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getGold() {
        return gold;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String toString() {
        return name + " hp=" + hp + " mana=" + mana + " gold=" + gold + " inv=[" + inventory + "]";
    }
}
