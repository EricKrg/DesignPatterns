package com.eric.Command;

/*
    class to call the specific commands in a unspecific way
*/

import com.eric.Command.commands.Command;

import java.util.ArrayList;

public class Caller {
    private Command cmd;
    //private ArrayList<Command> history = null;

    public void setCmd(Command inCmd){
        this.cmd = inCmd;
    }

    public void applyCmd(){
        //this.history.add(this.cmd);
        this.cmd.serve();
    }
}
