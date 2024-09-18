public abstract class Harcos {
    private int eletero, ugyesseg;

    public Harcos(int eletero, int ugyesseg) {
        this.setEletero(eletero);
        this.setUgyesseg(ugyesseg);
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public abstract int getTamadoEro();

    @Override
    public String toString() {
        return "Életerő: "+getEletero()+", "+"ügyesség: "+getUgyesseg();
    }
}
