public class Karakter {
    private String nev, faj, leiras;
    private int szint;

    public Karakter(String nev, String faj, String leiras, int szint) {
        this.setNev(nev);
        this.setFaj(faj);
        this.setLeiras(leiras);
        this.setSzint(szint);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public int getSzint() {
        return szint;
    }

    public void setSzint(int szint) {
        this.szint = szint;
    }

    @Override
    public String toString() {
        return getNev()+" "+getFaj()+" "+getLeiras()+" "+getSzint();
    }
}
