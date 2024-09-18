public class Troll extends Harcos{
    private int fegyverSebzes,allokepesseg;

    public Troll(int eletero, int ugyesseg, int fegyverSebzes, int allokepesseg) {
        super(eletero, ugyesseg);
        this.fegyverSebzes = fegyverSebzes;
        this.allokepesseg = allokepesseg;
    }

    public int getFegyverSebzes() {
        return fegyverSebzes;
    }

    public void setFegyverSebzes(int fegyverSebzes) {
        this.fegyverSebzes = fegyverSebzes;
    }

    public int getAllokepesseg() {
        return allokepesseg;
    }

    public void setAllokepesseg(int allokepesseg) {
        this.allokepesseg = allokepesseg;
    }

    @Override
    public int getTamadoEro() {
        return getAllokepesseg()+getFegyverSebzes()+getUgyesseg();
    }

    @Override
    public String toString() {
        return super.toString()+ ", Támadóerő:"+getTamadoEro();
    }
}
