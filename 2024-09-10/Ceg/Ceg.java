public abstract class Ceg {
    private String nev;
    private int vagyon;
    public abstract String getMukodesiForma();

    public Ceg(String nev, int vagyon) {
        this.setNev(nev);
        this.setVagyon(vagyon);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getVagyon() {
        return vagyon;
    }

    public void setVagyon(int vagyon) {
        this.vagyon = vagyon;
    }

    @Override
    public String toString() {
        return "Neév: "+getNev()+", vagyon: "+getVagyon()+" Ft, működési forma: "+getMukodesiForma();
    }
}
