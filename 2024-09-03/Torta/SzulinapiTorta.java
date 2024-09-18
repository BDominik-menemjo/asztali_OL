public class SzulinapiTorta extends Torta{
    private int gyertyakSzama;

    public SzulinapiTorta(String iz, int szeletek, int gyertyakSzama) {
        super(iz, szeletek);
        setGyertyakSzama(gyertyakSzama);
    }

    public int getGyertyakSzama() {
        return gyertyakSzama;
    }

    public void setGyertyakSzama(int gyertyakSzama) {
        this.gyertyakSzama = gyertyakSzama;
    }

    public String toString(){
        return super.toString()+ ", gyertyák száma: " + getGyertyakSzama();
    }

    public int getAr(){
        return super.getAr()+gyertyakSzama*GYERTYA;
    }
}
