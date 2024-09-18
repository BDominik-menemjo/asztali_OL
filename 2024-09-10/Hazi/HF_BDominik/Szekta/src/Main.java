//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Barbar b1=new Barbar(10,5,3);
        Troll t1=new Troll(15,3,2,4);

        Arena arena=new Arena(b1,t1);
        arena.Csata();
    }
}