package org.example.szerepjatekkarakterekgui;

public class Faj {
    private int id;
    private String faj;

    public Faj(int id, String faj) {
        this.setId(id);
        this.setFaj(faj);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    @Override
    public String toString() {
        return getFaj();
    }
}
