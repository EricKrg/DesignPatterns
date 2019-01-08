package com.eric.Strategy;

public class Knight extends Unit{
    public String name;

    public Knight(String inName){
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
        return "Knight{" +
                "name='" + name + '\'' +
                "attack='" + this.attack() + '\'' +
                "move='" + this.move() + '\'' +
                '}';
    }
}
