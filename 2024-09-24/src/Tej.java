public class Tej extends Tetel implements iTetel{
    private boolean isLaktozmentes;

    public Tej(String name, double kiszereles, double ar, boolean isLaktozmentes) {
        super(name, kiszereles, ar);
        this.isLaktozmentes = isLaktozmentes;
    }

    public Tej(String name, double kiszereles, double ar){
        this(name, kiszereles, ar, false);
    }

    public boolean isLaktozmentes() {
        return isLaktozmentes;
    }

    public void setLaktozmentes(boolean laktozmentes) {
        isLaktozmentes = laktozmentes;
    }

    @Override
    public double getBruttoAr() {
        return this.getAr()*1.05;
    }

    @Override
    public boolean isReturnable() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+", bruttó ára: "+this.getBruttoAr()+", visszavihető-e: "+(isReturnable()?"igen":"nem");
    }
}
