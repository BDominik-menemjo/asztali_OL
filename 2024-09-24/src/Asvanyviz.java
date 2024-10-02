public class Asvanyviz extends Tetel implements iTetel{
    private String csomagolas;

    public Asvanyviz(String name, double kiszereles, double ar, String csomagolas) {
        super(name, kiszereles, ar);
        this.csomagolas = csomagolas;
    }

    public String getCsomagolas() {
        return csomagolas;
    }

    public void setCsomagolas(String csomagolas) {
        this.csomagolas = csomagolas;
    }

    @Override
    double getBruttoAr() {
        return this.getAr()*1.27;
    }

    @Override
    public boolean isReturnable() {
        if(this.getKiszereles()<6||this.getKiszereles()>0&&(this.getCsomagolas().equals("PET")||this.getCsomagolas().equals("üveg")||this.getCsomagolas().equals("alumínium"))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+", bruttó ára: "+this.getBruttoAr()+", csomagolása: "+this.getCsomagolas()+", visszaváltható-e: "+(this.isReturnable()?"igen":"nem");
    }
}
