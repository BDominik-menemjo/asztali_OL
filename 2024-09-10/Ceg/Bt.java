public class Bt extends Ceg{
    private String beltag, kultag;

    public Bt(String nev, int vagyon, String beltag, String kultag) {
        super(nev, vagyon);
        this.setBeltag(beltag);
        this.setKultag(kultag);
    }

    public String getBeltag() {
        return beltag;
    }

    public void setBeltag(String beltag) {
        this.beltag = beltag;
    }

    public String getKultag() {
        return kultag;
    }

    public void setKultag(String kultag) {
        this.kultag = kultag;
    }

    @Override
    public String getMukodesiForma() {
        return "Betéti társaság";
    }

    @Override
    public String toString() {
        return super.toString()+", beltag: "+getBeltag()+", kültag: "+getKultag();
    }
}
