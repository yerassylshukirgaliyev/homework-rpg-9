package com.narxoz.rpg.vault;

import com.narxoz.rpg.artifact.Armor;
import com.narxoz.rpg.artifact.PriceVisitor;
import com.narxoz.rpg.artifact.ReportVisitor;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.combatant.HeroMemento;
import com.narxoz.rpg.memento.Caretaker;

public class ChronomancerEngine {
    private Caretaker caretaker = new Caretaker();

    public VaultRunResult run(Hero hero, boolean makeTrap) {
        String before = hero.toString();
        caretaker.add(hero.save());

        hero.addGold(100);
        hero.useMana(20);
        hero.addArtifact(new Armor("Rusty Time Armor", 2, 7));

        PriceVisitor priceVisitor = new PriceVisitor();
        ReportVisitor reportVisitor = new ReportVisitor();

        hero.getInventory().accept(reportVisitor);
        hero.getInventory().accept(priceVisitor);

        if (makeTrap) {
            hero.damage(80);
            hero.loseGold(50);
            HeroMemento old = caretaker.undo();
            if (old != null) {
                hero.restore(old);
            }
        }

        String after = hero.toString();
        return new VaultRunResult(makeTrap, priceVisitor.getTotal(), reportVisitor.getText(), before, after);
    }
}
