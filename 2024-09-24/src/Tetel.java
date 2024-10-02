import javax.swing.table.TableStringConverter;

public abstract class Tetel {
    private String name;
    private double ar,kiszereles;

    public Tetel(String name, double kiszereles, double ar) {
        this.setName(name);
        this.setKiszereles(kiszereles);
        this.setAr(ar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKiszereles() {
        return kiszereles;
    }

    public void setKiszereles(double kiszereles) {
        this.kiszereles = kiszereles;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    abstract double getBruttoAr();

    @Override
    public String toString() {
        return "Tétel neve: "+this.getName() +", kiszrelés: "+this.getKiszereles()+", nettó ára: "+getAr();
    }
}
