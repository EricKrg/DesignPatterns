package com.eric.Strategy.strats;

import com.eric.Strategy.strats.Movement;

public class HorseRiding implements Movement {
    @Override
    public String applyMove() {
        return "Moving with a horse";
    }
}
