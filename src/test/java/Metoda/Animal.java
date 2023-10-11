package Metoda;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class Animal {
    public String nume;
    public String rasa;

    @Test
    public void metodaTest() {
        System.out.println();
        calculDounaNumere(2, 3);
        calculDounaNumere(4, 6);
        System.out.println("Salariul lunar este de: " + getSalariu());
    }

    // calculam suma a doua numere - algoritm
    public void calculDounaNumere(int param1, int param2) {
        int suma = param1 + param2;
        System.out.println("Suma celor doua numere este: " + suma);
    }

    // metoda cu return
    public double getSalariu() {
        double salariu = 19999.99;
        return salariu;
    }
}
