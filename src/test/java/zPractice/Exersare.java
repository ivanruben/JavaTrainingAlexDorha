package zPractice;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class Exersare {

    @Test
    public void metodaTest() {
        System.out.println();
        System.out.println("\t1. ALGORITMI");
        sumaADouaNumere(565, 5445);
        System.out.println("\t2. GET METODE");
        System.out.println("Salariul tau este de: " + getSalariu() + " lei\n");

        System.out.println("\t3. STRUCTURI ALTERNATIVE - IF, ELSE-IF, ELSE");
        structuraIf(45, 452);
        structuraIf(34, 34);
        structuraIf(getSalariu(), 234);
        System.out.println();

        System.out.println("\t4. STRUCTURI ALTERNATIVE - SWITCH");
        structuraSwitch("audi");
        structuraSwitch("Tesla");
        structuraSwitch("BMW");
        structuraSwitch("bmw");
        System.out.println();

        System.out.println("\t5. STRUCTURI REPETITIVE - FOR");
        structuraFor(123);
        System.out.println("\t6. STRUCTURI REPETITIVE - WHILE");
        structuraWhile(2);
        System.out.println("\t7. STRUCTURI REPETITIVE - DO-WHILE");
        structuraDoWhile(10);

        System.out.println("\t8. LISTA STRINGURI");
        listaStringuri("Marcel");
        listaStringuri("Patrocle");
        System.out.println();


        List<String> produ = new ArrayList<>();
        produ.add("Margarina");
        produ.add("fasole");
        produ.add("Clementine");
        //produ.add("varza");

        List<String> produ2 = new ArrayList<>();
        produ2.add("Margarina");
        produ2.add("fasole");
        produ2.add("cartofi");


        System.out.println("\t9. LISTA ARRAY CU 1 PARAMETRU");
        listaArray1("carne");
        listaArray1("fasole");
        System.out.println();
        System.out.println("\t10. LISTA ARRAY CU LISTA DE PARAMETRII");
        listaArrayList(produ);
        listaArrayList(produ2);
    }

    // calculam suma a doua numere - algoritm
    public void sumaADouaNumere(int a, int b) {
        int suma;
        suma = a + b;
        System.out.println("Suma dintre \"a\"(" + a + ") si \"b\"(" + b + ") este: " + suma + "\n");
    }

    //metoda cu return
    public int getSalariu() {
        int salariu = 19000;
        return salariu;
    }

    // structuri alternative IF
    public void structuraIf(int a, int b) {
        if (a > b) {
            System.out.println(a + " este MAI MARE decat " + b);
        } else if (a == b) {
            System.out.println(a + " este = cu " + b);
        } else {
            System.out.println(a + " este mai mic decat " + b);
        }
    }

    // structuri alternative switch
    public void structuraSwitch(String masina) {

        switch (masina) {
            case "audi":
                System.out.println("Masina aleasa este AUDI");
                break;
            case "mercedes":
                System.out.println("Masina aleasa este MERCEDES");
                break;
            case "BMW":
                System.out.println("Masina aleasa este BMW");
                break;
            default:
                System.out.println("Masina dorita (" + masina + ") nu se afla in lista");
        }
    }

    //structuri repetitive for
    public void structuraFor(int a) {
        int index;
        int suma;
        for (index = 1; index < 10; index++) {
            suma = index + a;
            System.out.println("- adaugand " + index + " la numarul " + a + " se obtine " + suma);
        }
        System.out.println();
    }

    //structuri repetitive while
    public void structuraWhile(int a) {
        int index = 1;
        while (index < 10) {
            System.out.println(" - adaugand " + index + " la numarul " + a + " obtinem " + (a + index));
            index++;
        }
        System.out.println();
    }

    //structuri repetitive Dowhile
    public void structuraDoWhile(int a) {
        int index = 1;
        do {
            System.out.println("- adaugand " + index + " la numarul " + a + " obtinem " + (a + index));
            index++;
        } while (index < 10);
        System.out.println();
    }

    // lista de stringuri
    public void listaStringuri(String nume) {
        String[] colegi = new String[5];
        colegi[0] = "Viorel";
        colegi[1] = "Ioana";
        colegi[2] = "Marcel";
        colegi[3] = "Kiliment";
        colegi[4] = "Caspi";

        int nuExista = 0;
        int index = 0;
        while (index < colegi.length) {
            if (colegi[index] == nume) {
                nuExista = +1;
                System.out.println("Colegul " + nume + " se afla pe lista");
            }
            index++;
        }
        if (nuExista == 0) {
            System.out.println("Colegul " + nume + " NU se afla pe lista");
        }
    }

    // Array List
    public void listaArray1(String produs) {
        List<String> produse = new ArrayList<>();
        produse.add("Margarina");
        produse.add("fasole");
        produse.add("Clementine");
        produse.add("varza");

        if (produse.contains(produs)) {
            System.out.println("Produsul \"" + produs + "\" se afla in lista");
        } else {
            System.out.println("Produsul \"" + produs + "\" NU se afla in lista");
        }
    }

    public void listaArrayList(List<String> produsList) {
        List<String> produse = new ArrayList<>();
        produse.add("Margarina");
        produse.add("fasole");
        produse.add("Clementine");
        produse.add("varza");

        if (produse.containsAll(produsList)) {
            System.out.println("Produsele: " + produsList + " se afla in lista");
        } else {
            System.out.println("Produsele: " + produsList + " NU se afla in lista");
        }
    }

}




