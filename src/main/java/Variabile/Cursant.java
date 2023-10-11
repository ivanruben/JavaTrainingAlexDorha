package Variabile;


public class Cursant {
    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBac;


    public void afiseaza(){
        nume="Ivan";
        prenume="Ruben-Ioan";
        varsta=38;
        inaltime=1.80;
        greutate=89.3f;
        sex='M';
        areBac=true;

        System.out.print("Numele Cursantului este: "+ nume);
    }

}