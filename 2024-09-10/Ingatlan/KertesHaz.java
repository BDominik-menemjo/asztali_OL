public class KertesHaz extends Ingatlan{
    private double kert;

    public KertesHaz(double lakoter, double kert) {
        super(lakoter);
        this.setKert(kert);
    }

    public double getKert() {
        return kert;
    }

    public void setKert(double kert) {
        this.kert = kert;
    }

    @Override
    public double getMeret(){
        return kert+getLakoter();
    }

    @Override
    public String toString() {
        return super.toString()+", kert mérete: "+getKert()+" nm, összterület: "+getMeret()+" nm.";
    }
}
