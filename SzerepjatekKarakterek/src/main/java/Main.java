import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static double fajSzintAtlag(String faj, ArrayList<Karakter> adatok){
        int osszeg=0;
        int db=0;
        for(int i=0; i<adatok.size(); i++){
            Karakter k=adatok.get(i);
            if(k.getFaj().equals(faj)){
                osszeg+=k.getSzint();
                db++;
            }
        }
        return (double) osszeg/db;
    }
    public static void main(String[] args) {
        ArrayList<Karakter> karakterek=new ArrayList<>();
        try{
            FileReader fr=new FileReader("karakterek.csv");
            BufferedReader br = new BufferedReader(fr);
            String sor=br.readLine();
            while((sor=br.readLine())!=null){
                StringTokenizer st=new StringTokenizer(sor, ";");
                Karakter k=new Karakter(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
                karakterek.add(k);
            }
            br.close();
            fr.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        System.out.println("4. feladat");
        System.out.printf("Az elfek szintátlaga: %.3f\n",fajSzintAtlag("elf", karakterek));

        ArrayList<String> fajok=new ArrayList<>();
        ArrayList<Integer> fajokSzama=new ArrayList<>();
        for(int i=0;i< karakterek.size();i++){
            Karakter k=karakterek.get(i);
            if(!fajok.contains(k.getFaj())){
                fajok.add(k.getFaj());
                fajokSzama.add(0);
            }
        }

        for(int i=0;i< karakterek.size();i++) {
            Karakter k=karakterek.get(i);
            int index=fajok.indexOf(k.getFaj());
            int ujDb=fajokSzama.get(index)+1;
            fajokSzama.set(index, ujDb);
        }

        int maximum=fajokSzama.get(0);
        int maxi=0;
        for(int i=0;i<fajokSzama.size();i++){
            if(fajokSzama.get(i)>maximum){
                maximum=fajokSzama.get(i);
                maxi=i;
            }
        }

        System.out.println("5. feladat:");
        System.out.println("A leggyakoribb faj: "+fajok.get(maxi));

        System.out.println("6. feladat:");
        for (int i = 0; i < karakterek.size(); i++) {
            Karakter k= karakterek.get(i);

            if(k.getLeiras().contains("okos")){
                System.out.print(k.getNev()+" ");
            }
        }
    }
}
