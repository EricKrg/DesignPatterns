package com.eric.Command;

/*
    idea is to have a quick navbar with 1-4 buttons, where each button can have more then one Action (like in Videogames)
    i choose a smart home scenario as example

    this is the client

 */

import com.eric.Command.commands.IncreaseHeating;
import com.eric.Command.commands.LockDown;
import com.eric.Command.commands.ToggleLight;


public class QuickNav {

    Home smartHome;
    public QuickNav(Home inHome){
        this.smartHome = inHome;
    }

    private Caller caller = new Caller();

    public void select(int quickBtn) { // quickBtn 1-4
        switch (quickBtn) {
            case 1: // toggle light
                caller.setCmd(new ToggleLight(this.smartHome));
                caller.applyCmd();
                break;
            case 2: // adjust heat
                caller.setCmd(new IncreaseHeating(this.smartHome));
                caller.applyCmd();
                break;
            case 3: //lockdown
                caller.setCmd(new LockDown(this.smartHome));
                caller.applyCmd();
                break;
            default:
                System.out.println("Nur die Argumente 1-3 sind erlaubt.");
        }
    }
    // kombo selection
    public void select(int[] kombo){
        for(int btn : kombo ){
            this.select(btn);
        }
    }
}
