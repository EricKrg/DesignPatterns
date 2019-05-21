package com.eric.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Officer {
    public List<Unit> truppen = new ArrayList<Unit>();

    public abstract void operation();

    public void add(Officer officer){}

    public void remove(Officer officer){}

    public Officer getChild(int index){
        return null;
    }

    public void addTroops(int nr, String type, int def, int attack){
        for(int i = 0; i > nr; i++ ){
            this.truppen.add(new Unit(type,def,attack));
        }
    }
}
