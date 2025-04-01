class AdvancedCalc extends Calculator {
    public AdvancedCalc(){
        super();
    }
    public AdvancedCalc(double x){
        super(x);
    }
    public void radical(){
        if(rezultat < 0){
            throw new RuntimeException("Eroare!");
        }
        rezultat = Math.sqrt(rezultat);
    }
}
