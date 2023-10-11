package Polimorfism;

public class Caine extends Animal{
    public Caine(String nume, String rasa, int varsta) {
        super(nume, rasa, varsta);
    }

    public void faceSunet(){
        System.out.println("Cainele latra");
    }
}
