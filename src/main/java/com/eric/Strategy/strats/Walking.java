package com.eric.Strategy.strats;

import com.eric.Strategy.strats.Movement;

public class Walking implements Movement {
    @Override
    public String applyMove() {
        return "Moving on foot";
    }
}
