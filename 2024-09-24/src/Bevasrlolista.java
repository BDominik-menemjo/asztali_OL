import java.util.ArrayList;
import java.util.Collections;

public class Bevasrlolista {

    private ArrayList<Tetel> bl;

    public Bevasrlolista(){
        bl=new ArrayList<>();
    }

    public void tetelHozzaad(Tetel tetel){
        bl.add(tetel);
    }

    public void teteltKivesz(Tetel tetel){
        bl.remove(tetel);
    }

    public double getOsszErtek(){
        double ossz=0;
        for (Tetel t:bl){
            ossz+=t.getBruttoAr();
        }
        return ossz;
    }

    public int getOsszTetel(){
        return bl.size();
    }

    public Tetel getLegdragabbTetel(){
        Tetel legdragabb=null;
        for(Tetel t:bl){
            if(legdragabb==null||t.getBruttoAr()> legdragabb.getBruttoAr()){
                legdragabb=t;
            }
        }
        return legdragabb;
    }

    public ArrayList<String> getTetelNevekSorrendben(){
        ArrayList<String> nevek = new ArrayList<>();
        for(Tetel t:bl){
            nevek.add(t.getName());
        }
        Collections.sort(nevek);
        return nevek;
    }

    public double getVisszavaltasErtek() {
        double ossz = 0;
        for (Tetel t:bl) {
            if (t instanceof iTetel && ((iTetel) t).isReturnable()) {
                ossz += iTetel.VISSZAVALT;
            }
        }
        return ossz;
    }

    public boolean kornyezetTudatos(){
        int visszavaltos=0;
        for(Tetel t:bl){
            if(t instanceof iTetel && ((iTetel) t).isReturnable()){
                visszavaltos++;
            }
        }
        if(visszavaltos>=(bl.size())/2){
            return true;
        }else{
            return false;
        }
    }

    public boolean vanLaktozments(){
        for(Tetel t:bl){
            if(t instanceof Tej && ((Tej) t).isLaktozmentes()) {
                return true;
            }
        }
        return false;
    }

}
