package StaticKeyword;

public class Elev {
    // STATIC
    // Static are ca scop de a transmite o variabila / metoda dintr-o clasa in alta
    // In momentul in care avem mai multe obiecte de acelasi tip putem considera faptul ca acestia au o proprietate comuna (ex. scoala)
    // Valoarea proprietatii se pastreaza pentru toate obiectele

    private String nume;
    private String prenum;
    private int varsta;
    private static String scoala = "Mihai Eminescu";
    private static Integer nrElevi = 0;

    public Elev(String nume, String prenum, int varsta) {
        this.nume = nume;
        this.prenum = prenum;
        this.varsta = varsta;
    }

    public void prezentareElev(){
        System.out.println("\nElevul este: "+nume+" "+prenum+", are "+ varsta+" ani si este de la scoala "+scoala + ", si are numarul matricol: "+nrElevi );
        nrElevi++;
    }


}
