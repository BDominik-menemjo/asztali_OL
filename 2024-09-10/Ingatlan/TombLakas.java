public class TombLakas extends Ingatlan{
    public double erkely, tarolo;

    public TombLakas(double lakoter, double erkely, double tarolo) {
        super(lakoter);
        this.setErkely(erkely);
        this.setTarolo(tarolo);
    }

    public double getErkely() {
        return erkely;
    }

    public void setErkely(double erkely) {
        this.erkely = erkely;
    }

    public double getTarolo() {
        return tarolo;
    }

    public void setTarolo(double tarolo) {
        this.tarolo = tarolo;
    }

    @Override
    public double getMeret() {
        return getLakoter()+erkely+tarolo;
    }

    @Override
    public String toString() {
        return super.toString()+", erkély: "+getErkely()+" nm, tároló: "+getTarolo()+" nm, összterület: "+getMeret()+"nm";
    }
}
