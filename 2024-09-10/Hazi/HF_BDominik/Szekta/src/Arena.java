public class Arena {
    /*
  Definiáljunk
    metódust, amely szimulálja a küzdelmet az alábbiak szerint. Minden körben
    generáljunk egy számot az [1; 6] intervallumból a harcosoknak és amelyiknek
    magasabb, az támad! Ha az értékek egyenlőek, ismételjük meg a generálást. A
    támadó harcos támadóerejét vonjuk le a másik harcos életerejéből. Ha az így kapott
    érték 5 felett van, a harc megy tovább. Ha nem, az összecsapás véget ér.
    */
    private Harcos h1,h2;

    public Arena(Harcos harcos1, Harcos harcos2){
        this.h1=harcos1;
        this.h2=harcos2;
    }

    public void Csata(){
        int r1=(int)(Math.random()*6)+1;
        int r2=(int)(Math.random()*6)+1;
        while(r1!=r2 && h1.getEletero()>0 || h2.getEletero()>0){
            System.out.println("Első: "+r1+", Második: "+r2);
            if(r1>r2){
                System.out.println("Az első játékos támad!");
                h2.setEletero(h2.getEletero()- h1.getTamadoEro());
            }else{
                System.out.println("A második játékos támad!");
                h1.setEletero(h1.getEletero()-h2.getTamadoEro());
            }
            r1=(int)(Math.random()*6)+1;
            r2=(int)(Math.random()*6)+1;
        }
        if(h1.getEletero()<=0){
            System.out.println("A második játékos nyert!");
        }else{
            System.out.println("Azelső játékos nyert!");
        }
    }
}
