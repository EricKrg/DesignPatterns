package com.eric.Command;

/*
    this is the receiver of the commands
    Empfaenger

 */

public class Home {
    public boolean lights = false; // init. switched off
    public int Heating = 19;
    public boolean locked = false; //

    public Home(){}

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public int getHeating() {
        return Heating;
    }

    public void setHeating(int heating) {
        Heating = heating;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "Home{" +
                "lights=" + lights +
                ", Heating=" + Heating +
                ", locked=" + locked +
                '}';
    }
}
