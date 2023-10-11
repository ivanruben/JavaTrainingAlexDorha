package Multimi;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class Persoana {

    @Test
    public void metodaTest() {
        prezentareColegiArray();
        prezentareColegiLista();



    }
    // Array
    public void prezentareColegiArray() {
        String[] colegi = new String[5]; //[5] - acesta defineste dimensiunea (lenght-ul) array-ului.
        colegi[0] = "Oana";
        colegi[1] = "Alex";
        colegi[2] = "Ruben";
        colegi[3] = "Ion";
        colegi[4] = "Vasile";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Array - Numele colegului este: " + colegi[index]);
        }
    }

    // Lista
    public void prezentareColegiLista(){

        List<String> colegi = new ArrayList<>();
        colegi.add("Alex");
        colegi.add("Oana");
        colegi.add("Ruben");
        colegi.add("Ion");
        colegi.add("Vasile");

        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("List - Numele colegului este: " + colegi.get(index));
        }
    }
}


