package com.eric.State;

// this is the context

import com.eric.State.states.*;

import java.util.ArrayList;

public class CoffeMaker {
    private State machineState;
    int drinkCounter = 0;
    private ArrayList<String> history = new ArrayList<String>();

    public CoffeMaker(){
        this.machineState = new Standby();
        this.history.add(this.machineState.toString());
    }

    public State getMachineState() {
        return machineState;
    }

    public void setMachineState(State machineState) {
        this.machineState = machineState;
        this.serveState();
        this.history.add(this.machineState.toString());
        if(this.drinkCounter > 5){
            this.machineState = new Cleaning();
            this.serveState();
            this.history.add(this.machineState.toString());
        }
    }
    public void serveState(){
        this.machineState.serve(this);
    }

    public void increaseDrinkCounter() {
        this.drinkCounter++;
    }
    public void resetDrinkCounter() {
        this.drinkCounter = 0;
    }


    public String getLastState(){
        return this.history.get(history.size()-1);
    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "machineState=" + machineState +
                ", drinkCounter=" + drinkCounter +
                '}';
    }
}
