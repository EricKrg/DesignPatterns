package com.eric.Strategy;

import com.eric.Strategy.strats.BowAttack;
import com.eric.Strategy.strats.HorseRiding;

/*
    Kapsle dynamisches Verhalten von Klassen in Interfaces (hier Movement und Attack) und definiere Konkretes
    verhalten auf Basis von diesen Interfaces. Dieses konkrete Verhalten kann dann auf die Instanzen angewendet werden
    d.h. ein Swordsman kann zur Laufzeit seine Bewegungs art von Laufen auf Reiten ändern. Das hinzufügen neuer Verhalten
    ist somit auch leicht, da dies auf Basis der Interfaces passiert.

    Jedes statische Verhalten wird an der Klasse selbst gehalten.
 */
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
