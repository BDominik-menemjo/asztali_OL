import java.util.Arrays;

public class Kft extends Ceg{
    private String ugyvezeto;
    private int tagokSzama;
    private String tagok[];
    private int aktualisTagszam;

    public Kft(String nev, int vagyon, String ugyvezeto, int tagokSzama) {
        super(nev, vagyon);
        this.setUgyvezeto(ugyvezeto);
        this.setTagokSzama(tagokSzama);
        this.tagok = new String[tagokSzama-1];
    }

    public void addTag(String nev){
        if(aktualisTagszam<tagokSzama-1){
            tagok[aktualisTagszam]=nev;
            aktualisTagszam++;
        }else{
            System.err.println("Több tagot nem lehet felvenni.");
        }
    }

    public String getUgyvezeto() {
        return ugyvezeto;
    }

    public void setUgyvezeto(String ugyvezeto) {
        this.ugyvezeto = ugyvezeto;
    }

    public int getTagokSzama() {
        return tagokSzama;
    }

   private void setTagokSzama(int tagokSzama) {
        this.tagokSzama = tagokSzama;
    }

    @Override
    public String getMukodesiForma() {
        return "Korlátolt Felelőségű társaság";
    }

    @Override
    public String toString() {
        return super.toString()+", ügyvezető: "+getUgyvezeto()+", maximális tagok száma: "+getTagokSzama()+", fő"+"tagok: "+Arrays.toString(tagok);
    }
}
