package Polimorfism;

public class Pisica extends Animal{
    public Pisica(String nume, String rasa, int varsta) {
        super(nume, rasa, varsta);
    }
    public void manaca(){
        System.out.println("Pisica manaca Katfood");
    }
    public void manaca(String mancare){
        System.out.println("Pisica manaca "+ mancare);
    }
    public void manaca(int cantitate){
        System.out.println("Pisica manaca "+ cantitate +" grame de mancare");
    }
    @Override
    public void faceSunet() {
        System.out.println("Pisica miauna");
    }
}
