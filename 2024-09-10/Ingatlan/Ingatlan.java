public abstract class Ingatlan {
    private double lakoter;

    public Ingatlan(double lakoter) {
        this.setLakoter(lakoter);
    }

    public double getLakoter() {
        return lakoter;
    }

    public void setLakoter(double lakoter) {
        this.lakoter = lakoter;
    }

    @Override
    public String toString() {
        return "Lakótér: "+this.getLakoter()+" nm";
    }

    public abstract double getMeret();
}
