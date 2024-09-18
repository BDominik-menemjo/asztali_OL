import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Etel e1=new Etel("Sonka",20);
        Etel e2=new Etel("sonka",20);
        Etel cs=new Etel("csirkehús",10);
        Etel sz=new Etel("szalámi", 10);
        Etel b=new Etel("bacon",20);
        Etel k=new Etel("kolbász",30);
        Etel s=new Etel("sajt",20);

        Pizza p = new Pizza("Húsos", 2000);
        p.feltetetFelvesz(e1);
        p.feltetetFelvesz(e2);
        p.feltetetFelvesz(cs);
        p.feltetetFelvesz(sz);
        p.feltetetFelvesz(b);
        p.feltetetFelvesz(b);
        p.feltetetFelvesz(k);
        p.feltetetFelvesz(s);

        System.out.println(p);
    }
}