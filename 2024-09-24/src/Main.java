//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bevasrlolista b=new Bevasrlolista();

        Tej t1=new Tej("Tej", 1, 200, true);
        Tej t2=new Tej("Tej2", 0.5, 560);
        Asvanyviz a1=new Asvanyviz("Víz", 1.5, 150, "PET");
        Asvanyviz a2=new Asvanyviz("Sör",0.5,280,"alumínium");
        Asvanyviz a3=new Asvanyviz("Sör2", 0.33, 450,"üveg");//sátánfajzat
        Asvanyviz a4=new Asvanyviz("Almalé",1, 420,"papír");

        b.tetelHozzaad(t1);
        b.tetelHozzaad(t2);
        b.tetelHozzaad(a1);
        b.tetelHozzaad(a2);
        b.tetelHozzaad(a3);
        b.tetelHozzaad(a4);

        System.out.println(b.getLegdragabbTetel());
        System.out.println(b.getOsszErtek());
        System.out.println(b.getOsszTetel());
        System.out.println(b.getTetelNevekSorrendben());
        System.out.println(b.kornyezetTudatos());
        System.out.println(b.getVisszavaltasErtek());
        System.out.println(b.vanLaktozments());

        b.teteltKivesz(t1);
        b.teteltKivesz(a1);
        b.teteltKivesz(a2);
        b.teteltKivesz(a3);

        System.out.println("Kiszedés után");
        System.out.println(b.getLegdragabbTetel());
        System.out.println(b.getOsszErtek());
        System.out.println(b.getOsszTetel());
        System.out.println(b.getTetelNevekSorrendben());
        System.out.println(b.kornyezetTudatos());
        System.out.println(b.getVisszavaltasErtek());
        System.out.println(b.vanLaktozments());


    }
}