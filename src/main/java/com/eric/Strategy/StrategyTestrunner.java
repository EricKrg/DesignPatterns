package com.eric.Strategy;

import com.eric.Strategy.strats.BowAttack;
import com.eric.Strategy.strats.HorseRiding;
import com.eric.Strategy.strats.SwordAttack;
import com.eric.Strategy.strats.Walking;

public class StrategyTestrunner {
    public static void main(String args[]){
        // run the pattern
        final Swordsman richard = new Swordsman("Richard");
        System.out.println(richard);

        final Knight ben = new Knight("Ben");
        System.out.println(ben);

        richard.setAttack(new BowAttack()); // richard got a Bow and a Horse
        richard.setMovement(new HorseRiding());
        System.out.println(richard);
    }
}
