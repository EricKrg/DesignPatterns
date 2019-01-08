package com.eric.Strategy;

import com.eric.Strategy.strats.HorseRiding;
import com.eric.Strategy.strats.SwordAttack;
import com.eric.Strategy.strats.Walking;

public class StrategyTestrunner {
    public static void main(String args[]){
        // run the pattern
        final Swordsman richard = new Swordsman("Richard");
        richard.setAttack(new SwordAttack());
        richard.setMovement(new Walking());

        System.out.println(richard);

        final Knight ben = new Knight("Ben");
        ben.setAttack(new SwordAttack());
        ben.setMovement(new HorseRiding());

        System.out.println(ben);
    }
}
