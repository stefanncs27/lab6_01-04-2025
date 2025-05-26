public class Main {
    public static void main(String[] args) {
        // Cream un obiect Calculator cu valoarea initiala 7
        Calculator c = new Calculator(7);
        AdvancedCalculator a = new AdvancedCalculator(9);

        // Aplicam operatii pe obiectul c si modificam valoarea rezultatului
        c.adunare(5);       // Adunam 5 la rezultat
        c.scadere(2);       // Scadem 2 din rezultat
        c.inmultire(3);     // Inmultim rezultatul cu 3
        c.impartire(2);     // Impartim rezultatul la 2
        a.radical();

        // Afișăm rezultatul final
        System.out.println("Rezultat final : " + c.getRezultat());

        // O alta abordare: folosim un singur obiect Calculator pentru a face aceleași operatii
        // si afisam rezultatul intr-o singura linie de cod
        System.out.println(new Calculator(7)
                .adunare(5)
                .scadere(2)
                .inmultire(3)
                .impartire(2)
                .getRezultat());
        System.out.println("Rezultatul este: " + a.getRezultat());
    }
}