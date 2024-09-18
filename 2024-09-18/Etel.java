public class Etel {
    private String nev;
    private int kaloria;
    private boolean fogyaszthato;

    public Etel(String nev, int kaloria) {
        this.setNev(nev);
        this.setKaloria(kaloria);
        this.setFogyaszthato(true);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isFogyaszthato() {
        return fogyaszthato;
    }

    public void setFogyaszthato(boolean fogyaszthato) {
        this.fogyaszthato = fogyaszthato;
    }

    public int getKaloria() {
        return kaloria;
    }

    public void setKaloria(int kaloria) {
        this.kaloria = kaloria=(kaloria<0)?0:kaloria;
    }

    @Override
    public String toString() {
        return this.getNev()+" ("+getKaloria()+" kalória), fogyasztható: "+(isFogyaszthato()?"igen":"nem");
    }
}
