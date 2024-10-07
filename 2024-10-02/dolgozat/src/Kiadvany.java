public abstract class Kiadvany implements iKonyv{
    private int nettoAr;

    public Kiadvany(int nettoAr) {
        this.setNettoAr(nettoAr);
    }

    public Kiadvany(){
        this.setNettoAr(MIN);
    }

    public int getNettoAr() {
        return nettoAr;
    }

    public void setNettoAr(int nettoAr) {
        this.nettoAr = nettoAr;
    }

    abstract double getBruttoAr();

    @Override
    public String toString() {
        return "Kiadvány nettó ára: "+this.getNettoAr();
    }
}
