package com.eric.State.states;

import com.eric.State.CoffeMaker;

public class CoffeMaking implements State {
    @Override
    public void serve(CoffeMaker maker) {
        System.out.println(maker.getLastState());
        if(maker.getLastState() == "Paying{}") {
            //maker.setMachineState(new CoffeMaking());
            System.out.println("your coffee is made");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println("done");
            maker.increaseDrinkCounter();
            maker.setMachineState(new Standby());
        } else {
            System.out.println("Pls pay first!");
        }
    }

    @Override
    public String toString() {
        return "CoffeMaking{}";
    }
}
