import java.util.ArrayList;

public class Pizza extends Etel{
    private int ar;
    private ArrayList<Etel> feltetek;

    public Pizza(String nev, int kaloria, int ar) {
        super((nev.endsWith("pizza")?nev:nev+" pizza"), kaloria);
        this.setAr(ar);
        feltetek=new ArrayList<>();
    }

    public Pizza(String nev, int kaloria) {
        this(nev, kaloria, 3200);
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar =(ar<0)?1000:ar;
    }

    public void feltetetFelvesz(Etel e){
        /*for(int i=0; !volt&&i<feltetek.size(); i++){
            if(feltetek.get(i).getNev().equals(e.getNev())){
                volt=true;
            }
        }*/
        int i=0;
        while (i< feltetek.size()&&  !feltetek.get(i).getNev().equalsIgnoreCase(e.getNev()) && i<feltetek.size()){
            i++;
        }

        if (i== feltetek.size()){
            feltetek.add(e);
            setKaloria(getKaloria()+e.getKaloria());
        }
    }

    @Override
    public String toString() {
        String er = super.toString()+", ár: "+getAr()+" Ft";
        if(!feltetek.isEmpty()){
            er+=", feltétek: ";
            for(int i=0; i<feltetek.size();i++){
                er+=feltetek.get(i).getNev();
                if(i<feltetek.size()-1){
                    er+=", ";
                }
            }
        }
        return er;
    }
}
