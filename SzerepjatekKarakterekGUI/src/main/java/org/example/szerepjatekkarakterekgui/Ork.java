package org.example.szerepjatekkarakterekgui;

public class Ork {
    private int intelligencia;

    public Ork(int intelligencia) {
       this.intelligencia = intelligencia;
    }

    public boolean okos(){
        return intelligencia > 40;
    }
}
