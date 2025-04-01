public class Calculator {
    double rezultat;

    public Calculator() {
        rezultat = 0;
    }
    public Calculator(double x) {
        rezultat = x;
    }
    public void adunare(double x) {
        rezultat += x;
    }
    public void scadere(double x) {
        rezultat -= x;
    }
    public void inmultire(double x) {
        rezultat *= x;
    }
    public void impartire(double x) {
        if(x == 0){
            throw new RuntimeException("Nu se poate imparti la 0!");
        }
        rezultat /=x;
    }
    public double getRezultat() {
        return rezultat;
    }
}
