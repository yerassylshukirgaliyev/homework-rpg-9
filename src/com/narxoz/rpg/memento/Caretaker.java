package com.narxoz.rpg.memento;

import com.narxoz.rpg.combatant.HeroMemento;
import java.util.Stack;

public class Caretaker {
    private Stack<HeroMemento> history = new Stack<>();

    public void add(HeroMemento memento) {
        history.push(memento);
    }

    public HeroMemento undo() {
        if (history.empty()) {
            return null;
        }
        return history.pop();
    }

    public int size() {
        return history.size();
    }
}
