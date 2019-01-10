package com.eric.State;

import com.eric.State.states.CoffeMaking;
import com.eric.State.states.Paying;

public class StateTestrunner
{
    public static void main(String args[]){
        CoffeMaker myMachine = new CoffeMaker();

        System.out.println(myMachine);
        myMachine.setMachineState(new CoffeMaking());

        myMachine.setMachineState(new Paying());
        myMachine.setMachineState(new CoffeMaking());
        System.out.println(myMachine);

        for(int i = 0; i < 10; i++){
            myMachine.setMachineState(new Paying());
            myMachine.setMachineState(new CoffeMaking());
            System.out.println(myMachine);
        }


    }
}
