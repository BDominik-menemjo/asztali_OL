public class Konyv extends Kiadvany implements iKonyv{
    private String szerzo, cim;

    public Konyv(int nettoAr, String szerzo, String cim) {
        super(nettoAr);
        this.setSzerzo(szerzo);
        this.setCim(cim);
    }

    public Konyv(String szerzo, String cim){
        this.setSzerzo(szerzo);
        this.setCim(cim);
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    @Override
    double getBruttoAr() {
        return getNettoAr()*AFA_NAGY;
    }

    @Override
    public boolean isDragaKonyv() {
        return this.getNettoAr() >= MAX;
    }

    @Override
    public String toString() {
        return super.toString()+", cime: "+this.getCim()+", szerzője: "+this.getSzerzo()+", bruttó ára: "+this.getBruttoAr()+", drága-e a könyv: "+(isDragaKonyv()?"igen":"nem");
    }
}
