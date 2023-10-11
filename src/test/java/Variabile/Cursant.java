package Variabile;
import org.testng.annotations.Test;

public class Cursant {
    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBac;
    @Test
    public void afiseaza() {
        nume = "Ivan";
        prenume = "Ruben-Ioan";
        varsta = 38;
        inaltime = 1.80;
        greutate = 89.3f;
        sex = 'M';
        areBac = true;

        System.out.println("Numele si prenumele cursantului sunt: " + nume + " " + prenume);
        System.out.println("Varsta cursantului este: " + varsta);
        System.out.println("Inaltimea cursantului este: " + inaltime);
        System.out.println("Greutatea cursantului este: " + greutate);
        System.out.println("Sexul cursantului este: " + sex);
        System.out.println("Are cursantul bac luat? : " + areBac);

    }

}