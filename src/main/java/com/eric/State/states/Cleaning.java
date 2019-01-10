package com.eric.State.states;

import com.eric.State.CoffeMaker;

public class Cleaning implements State {
    @Override
    public void serve(CoffeMaker maker) {
        System.out.println("cleaning pls wait");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("Done");
        maker.resetDrinkCounter();
        maker.setMachineState(new Standby());
    }

    @Override
    public String toString() {
        return "Cleaning{}";
    }
}
