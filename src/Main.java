public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(7);

        c.adunare(5);
        c.scadere(2);
        c.inmultire(3);
        c.impartire(2);

        System.out.println("Rezultat final : " + c.getRezultat());

        System.out.println(new Calculator(7)
                .adunare(5)
                .scadere(2)
                .inmultire(3)
                .impartire(2)
                .getRezultat());
    }
}
