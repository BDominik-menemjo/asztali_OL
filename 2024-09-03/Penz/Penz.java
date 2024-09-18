public class Penz implements iPenz {
    private int euro, cent;

    public Penz(int euro, int cent) {
        this.setEuro(euro);
        this.setCent(cent);
    }

    public Penz(int euro) {
        this(euro, 0);
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.cent = cent;
    }

    public int atvalt(double arfolyam) {
        return (int) ((euro + cent * 0.01) * arfolyam);
    }

    public int atvalt() {
        return atvalt(ARFOLYAM);
    }

    @Override
    public String toString() {
        return "Penz{" +
                "euro=" + getEuro() +
                ((getCent() != 0) ? ", cent=" + cent : "") +
                '}';
    }
}
