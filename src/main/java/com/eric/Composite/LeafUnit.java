package com.eric.Composite;

public class Unit {
    String type = "";
    int def = 0;
    int attack = 0;
    public Unit(String type, int inDef, int inAtt){
        this.attack = inAtt;
        this.def = inDef;
        this.type = type;
    }
}
