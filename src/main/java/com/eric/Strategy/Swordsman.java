package com.eric.Strategy;

import com.eric.Strategy.strats.Attack;
import com.eric.Strategy.strats.Movement;

public class Swordsman extends Unit {
    public String name;

    public Swordsman(String inName){
        this.name = inName;
    }


    @Override
    public String attack() {
        return this.getAttack().applyAttack();
    }

    @Override
    public String move() {
        return this.getMovement().applyMove();
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
