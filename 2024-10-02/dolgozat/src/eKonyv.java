public final class eKonyv extends Konyv{
    private String formatum;

    public eKonyv(int nettoAr, String szerzo, String cim, String formatum) {
        super(nettoAr, szerzo, cim);
        this.setFormatum(formatum);
    }

    public String getFormatum() {
        return formatum;
    }

    public void setFormatum(String formatum) {
        this.formatum = formatum;
    }

    @Override
    double getBruttoAr() {
        return this.getNettoAr()*AFA_KICSI;
    }

    @Override
    public boolean isDragaKonyv() {
        return super.isDragaKonyv();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
