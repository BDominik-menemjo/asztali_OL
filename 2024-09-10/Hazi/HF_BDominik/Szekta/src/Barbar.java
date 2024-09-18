public class Barbar extends Harcos{
    private int fegyverSebzes;

    public Barbar(int eletero, int ugyesseg, int fegyverSebzes) {
        super(eletero, ugyesseg);
        this.fegyverSebzes = fegyverSebzes;
    }

    public int getFegyverSebzes() {
        return fegyverSebzes;
    }

    public void setFegyverSebzes(int fegyverSebzes) {
        this.fegyverSebzes = fegyverSebzes;
    }

    @Override
    public int getTamadoEro() {
        return getFegyverSebzes()+getUgyesseg();
    }

    @Override
    public String toString() {
        return super.toString()+ ", Támadóerő:"+getTamadoEro();
    }
}
