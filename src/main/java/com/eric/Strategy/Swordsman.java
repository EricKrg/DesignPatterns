package com.eric.Strategy;

import com.eric.Strategy.strats.Attack;
import com.eric.Strategy.strats.Movement;
import com.eric.Strategy.strats.SwordAttack;
import com.eric.Strategy.strats.Walking;

public class Swordsman extends Unit {
    public String name;

    public Swordsman(String inName){
        this.name = inName;
        this.attack = new SwordAttack();
        this.movement = new Walking();

    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "name='" + name + '\'' +
                "attack='" + this.attack() + '\'' +
                "move='" + this.move() + '\'' +
                '}';
    }
}
