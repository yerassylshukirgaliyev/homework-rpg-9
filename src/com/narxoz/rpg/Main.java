package com.narxoz.rpg;

import com.narxoz.rpg.artifact.Potion;
import com.narxoz.rpg.artifact.Ring;
import com.narxoz.rpg.artifact.Scroll;
import com.narxoz.rpg.artifact.Weapon;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;
import com.narxoz.rpg.vault.VaultRunResult;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Arman", 100, 70, 20);
        hero.addArtifact(new Weapon("Old Sword", 1, 9));
        hero.addArtifact(new Potion("Small Red Potion", 1, 15));
        hero.addArtifact(new Scroll("Paper Fire", 2, "fire", 20));
        hero.addArtifact(new Ring("Blue Ring", 3, "mana"));

        ChronomancerEngine engine = new ChronomancerEngine();
        VaultRunResult result = engine.run(hero, true);

        System.out.println("Before:");
        System.out.println(result.getBefore());
        System.out.println();
        System.out.println("Visitor report:");
        System.out.print(result.getReport());
        System.out.println("Total price: " + result.getPrice());
        System.out.println();
        System.out.println("Trap happened: " + result.isTrap());
        System.out.println("After rewind:");
        System.out.println(result.getAfter());
    }
}
