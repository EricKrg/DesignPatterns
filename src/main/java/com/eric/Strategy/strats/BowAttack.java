package com.eric.Strategy.strats;

public class BowAttack implements Attack {
    @Override
    public String applyAttack() {
        return "Shoot with a Bow!";
    }
}
