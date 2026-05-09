package com.narxoz.rpg.combatant;

import com.narxoz.rpg.artifact.Inventory;

public final class HeroMemento {
    private final int hp;
    private final int mana;
    private final int gold;
    private final Inventory inventory;

    HeroMemento(int hp, int mana, int gold, Inventory inventory) {
        this.hp = hp;
        this.mana = mana;
        this.gold = gold;
        this.inventory = inventory.copy();
    }

    int getHp() {
        return hp;
    }

    int getMana() {
        return mana;
    }

    int getGold() {
        return gold;
    }

    Inventory getInventory() {
        return inventory.copy();
    }
}
