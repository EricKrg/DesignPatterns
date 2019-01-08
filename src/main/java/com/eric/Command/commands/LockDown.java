package com.eric.Command.commands;

import com.eric.Command.Home;

public class LockDown implements Command {
    private Home home;

    public LockDown(Home inHome){
        this.home = inHome;
    }

    @Override
    public void serve() {
        this.home.setLocked(true);
    }
}
