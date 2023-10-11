package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative: if-than-else, switch-case

    @Test
    public void metodaTest() {
        verificaNumarMaiMare(5, 6);
        verificaNumarMaiMare(7, 6);
        verificaNumarMaiMare(6, 6);
        System.out.println();
        meniulZilei("cartofi");

    }

    //verificam daca un numar este mai mare ca 10
    public void verificaNumarMaiMare(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("Numarul " + nr1 + " este mai MARE ca " + nr2);
        } else if (nr1 == nr2) {
            System.out.println("Numarul " + nr1 + " este = cu " + nr2);
        } else {
            System.out.println("Numarul " + nr1 + " este mai mic decat " + nr2);
        }
    }

    // alegem ce vrem sa mancam la pauza de masa
    public void meniulZilei(String optiune){
        switch (optiune){
            case "supa":
                System.out.println("Clientul a comandat supa");
                break;
            case "mamaliga":
                System.out.println("Clientul a comandat mamaliga");
                break;
            case "sarmale":
                System.out.println("Clientul a comandat sarmale");
                break;
            case "porumb":
                System.out.println("Clientul a comandat porumb fiert");
                break;
            default:
                System.out.println("Optiunea dorita nu se afla in Meniu");
        }
    }
}
