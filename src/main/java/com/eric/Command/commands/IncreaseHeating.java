package com.eric.Command.commands;

import com.eric.Command.Home;

public class IncreaseHeating implements Command {
    private Home home;

    public IncreaseHeating(Home inHome){
        this.home = inHome;
    }

    @Override
    public void serve() {
        int temp = this.home.getHeating();
        if(temp < 30) this.home.setHeating(temp + 5);
    }
}
