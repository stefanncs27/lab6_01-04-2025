public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.adunare(5);
        c.scadere(2);
        c.inmultire(3);
        System.out.println(c.getRezultat());
    }
}