public class Main {
    public static void main(String[] args) {
        KertesHaz haz = new KertesHaz(200, 500);
        System.out.println(haz);
        TombLakas lakas = new TombLakas(50,10,3);
        System.out.println(lakas);

        Bt bt=new Bt("Kiss Bt.", 1000000, "Kiss Pista", "Nagy Árpád");
        System.out.println(bt);

        Kft kft=new Kft("Nagy Kft.", 3000000, "Nagy Árpád", 3);
        kft.addTag("Közepes Annna");
        kft.addTag("Hatalmas Bálint");
        kft.addTag("Hatalmas Károly");
        System.out.println(kft);
    }
}
