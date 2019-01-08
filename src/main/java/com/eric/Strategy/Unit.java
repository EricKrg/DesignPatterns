package com.eric.Strategy;

import com.eric.Strategy.strats.Attack;
import com.eric.Strategy.strats.Movement;

public abstract class Unit {
    public Movement movement = null;
    public Attack attack = null;


    public String attack() {
        this.setAttack(this.attack);
        return this.getAttack().applyAttack();
    }

    public String move() {
        this.setMovement(this.movement);
        return this.getMovement().applyMove();
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
    public Movement getMovement() {
        return movement;
    }
    public Attack getAttack() {
        return attack;
    }

}
