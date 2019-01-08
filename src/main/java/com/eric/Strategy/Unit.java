package com.eric.Strategy;

import com.eric.Strategy.strats.Attack;
import com.eric.Strategy.strats.Movement;

public abstract class Unit {

    private Movement movement = null;
    private Attack attack = null;


    public abstract String move();
    public abstract String attack();

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
