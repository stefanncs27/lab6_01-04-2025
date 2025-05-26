// Clasa AdvancedCalculator extinde clasa Calculator, adăugând funcționalități suplimentare
public class AdvancedCalculator extends Calculator {

    // Constructor fără parametri care apelează constructorul părinte (Calculator) fără parametri
    public AdvancedCalculator() {
        super();  // Apelează constructorul părinte Calculator(), care setează rezultat la 0
    }

    // Constructor cu un parametru care apelează constructorul părinte (Calculator) cu un parametru
    public AdvancedCalculator(double x) {
        super(x);  // Apelează constructorul părinte Calculator(x), care setează rezultat la x
    }

    // Metodă pentru calcularea radicalului pătratic al rezultatului
    public void radical(){
        // Verificăm dacă rezultatul este negativ, pentru că radicalul unui număr negativ nu este definit în reali
        if(rezultat < 0) {
            // Dacă rezultatul este negativ, aruncăm o excepție cu mesajul "Radical!!!"
            throw new RuntimeException("Radical!!!");
        }
        // Dacă rezultatul este valid (mai mare sau egal cu 0), calculăm radicalul pătratic
        rezultat = Math.sqrt(rezultat);  // Math.sqrt() returnează radicalul pătratic al valorii
    }
}
