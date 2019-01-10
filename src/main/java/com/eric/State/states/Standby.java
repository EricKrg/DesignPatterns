package com.eric.State.states;

import com.eric.State.CoffeMaker;

public class Standby implements State {
    @Override
    public void serve(CoffeMaker maker) {
        System.out.println("waiting for order");
    }
}
