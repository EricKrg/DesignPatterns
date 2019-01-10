package com.eric.State.states;

import com.eric.State.CoffeMaker;

public class Paying implements State {
    @Override
    public void serve(CoffeMaker maker) {
        System.out.println("Thank you, you may order now!");
    }

    @Override
    public String toString() {
        return "Paying{}";
    }
}
