public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.adunare(5);
        c.scadere(2);
        c.inmultire(3);
        AdvancedCalc a = new AdvancedCalc(c.getRezultat());
        a.radical();
        System.out.println(c.getRezultat());
        System.out.println(a.getRezultat());
    }
}