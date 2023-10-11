package Variabile;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Masina {
    public String brand;
    public String tip;
    public String categorie;
    public int anFabricatie;
    public String lunaFabricatie;
    public float greutate;
    public boolean esteCoupe;
    public int capiPutere;
    public int capacitate;
    public double pret;
    public SimpleDateFormat dataUltimaInmatriculare;

    @Test
    public void afiseazaDetalii(){
        brand = "Audi";
        tip = "Q8";
        categorie = "SUV";
        anFabricatie = 2022;
        lunaFabricatie = "07";
        greutate = 2.5f;
        esteCoupe = true;
        capiPutere = 230;
        capacitate = 2600;
        pret = 59999.99;
        dataUltimaInmatriculare = new SimpleDateFormat("07-07-2023");


        System.out.println("\nMasina gasita este un: " + brand + " " + tip + ", din categoria: " + categorie);
        System.out.println("Anul si luna fabricatiei sunt: " + lunaFabricatie + "." + anFabricatie);
        System.out.println("Masina are o greutate de " + greutate + " tone, avand o capacitate de " + capacitate + " cm cubi, si o putere de " + capiPutere + " CP.");
        System.out.println("Pretul de pornire al masinii incepe de la: " + pret + " EUR");
        System.out.println("Ultima data a inmatricularii este: " + dataUltimaInmatriculare.toLocalizedPattern());







    }
}
