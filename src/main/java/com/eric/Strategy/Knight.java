package com.eric.Strategy;

import com.eric.Strategy.strats.HorseRiding;
import com.eric.Strategy.strats.SwordAttack;

public class Knight extends Unit{
    public String name;

    public Knight(String inName){
        this.name = inName;
        this.movement = new HorseRiding();
        this.attack = new SwordAttack();
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                "attack='" + this.attack() + '\'' +
                "move='" + this.move() + '\'' +
                '}';
    }
}
