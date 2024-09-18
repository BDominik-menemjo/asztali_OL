public class EskuvoiTorta extends Torta{
    private int emeletekSzama;

    public EskuvoiTorta(String iz, int szeletek, int emeletekSzama) {
        super(iz, szeletek);
        setEmeletekSzama(emeletekSzama);
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public void setEmeletekSzama(int emeletekSzama) {
        this.emeletekSzama = emeletekSzama;
    }


    public String toString() {
        return super.toString() +", emeletek száma: "+getEmeletekSzama();
    }

    public int getAr(){
        return super.getAr()+emeletekSzama*SZINTEK;
    }
}
