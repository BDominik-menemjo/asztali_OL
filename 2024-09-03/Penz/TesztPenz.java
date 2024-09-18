public class TesztPenz {
    public static void main(String[] args) {
        Penz penz = new Penz(10,50);
        System.out.println("Nyomott árfolyamon: "+penz.atvalt(200)+" Ft");
        System.out.println(penz);
        Penz zsebpenz = new Penz(15);
        System.out.println(zsebpenz);
        System.out.println("Beépíett árfolyamon: "+zsebpenz.atvalt()+" Ft");

        Torta torta = new Torta("csokis",10);
        System.out.println(torta);
        Torta sztorta = new SzulinapiTorta("csokis",10, 4);
        System.out.println(sztorta);
        Torta etorta = new EskuvoiTorta("csokis",10, 3);
        System.out.println(etorta);
    }
}


