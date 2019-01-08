package com.eric.Command.commands;

import com.eric.Command.Home;
import com.eric.Command.commands.Command;

public class ToggleLight implements Command {
    private Home home;

    public ToggleLight(Home inHome){
        this.home = inHome;
    }

    @Override
    public void serve() {
        this.home.setLights(!this.home.isLights());
    }
}
