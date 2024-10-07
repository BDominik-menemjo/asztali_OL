import java.util.ArrayList;

public class Teszt {
    public static void main(String[] args) {
        ArrayList konyvek = new ArrayList<>();

        Konyv k1=new Konyv(4990, "Áron András", "Megfogtam a gitár nyakát és lekváross piritós volt");
        Konyv k2=new Konyv("John Doe", "Hagyma");
        eKonyv e1 = new eKonyv(3990, "Alma Attila", "Astoria", "pdf");
        eKonyv e2 = new eKonyv(8990, "Arató András", "Mém", "epub");
        eKonyv e3 = new eKonyv(1000, "Csonka András", "Éneklés 101", "docx");

        konyvek.add(k1);
        konyvek.add(k2);
        konyvek.add(e1);
        konyvek.add(e2);
        konyvek.add(e3);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
