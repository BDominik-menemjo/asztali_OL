public class Torta implements iTorta{
    private String iz;
    private int szeletek;

    public Torta(String iz, int szeletek) {
        this.setIz(iz);
        this.setSzeletek(szeletek);
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public int getSzeletek() {
        return szeletek;
    }

    public void setSzeletek(int szeletek) {
        this.szeletek = szeletek;
    }

    @Override
    public String toString() {
        return "A torta" +
                "ize ='" + getIz() + '\'' +
                ", szeletek=" + getSzeletek() +
                ", ára = " + getAr()+ " Ft";
    }

    @Override
    public int getAr() {
        return szeletek*SZELETEK;
    }
}
