package zPractice;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Exersare2 {

    @Test
    public void metodaTest() {
//        System.out.println();
//        System.out.println("\t1.ALGORITMI");
//        algoritmi(1, 2, 3);
//        System.out.println();
//        System.out.println("\t2.GET METODE si IF-ELSE");
//
//        System.out.println("Numele cu cele mai multe caractere este: "+ getRaspuns() );
//        System.out.println();
//        System.out.println("\t3.SWITCH");
//        switchMethode(4);
//        String nume = "Paul";
//        System.out.println("Varsta persoanei alese("+nume+") este de "+ switchMethode2(nume) + " ani");
//        grafic();
//        for(int i=0;i<4;i++) {
//            jocaCuArray(i);
//        }
//        matrice();
//        eachfor();
//        builder();
       newSwithc();
//      int sum = addTwoNumbers(3,4);
        //System.out.println(sum);

//        int[] sir = {1,2,-3,2,5,3,5,-6,7,8,9};
//        int[] sirNou = sortAndIncrementFunction(sir);
//        for(int i : sirNou){
//            System.out.print(i + ", ");
//        }

    }

    public void algoritmi(int aa, int bb, int cc) {
        double suma = aa + bb;
        double diferenta = suma - aa;
        double produs = bb * cc;
        double impartire = produs / aa;
        System.out.println("Suma numerelor \"" + aa + "\" si \"" + bb + "\" este: " + suma);
        System.out.println("Diferenta numerelor \"" + suma + "\" si \"" + aa + "\" este: " + diferenta);
        System.out.println("Produsul numerelor \"" + bb + "\" si \"" + cc + "\" este: " + produs);
        System.out.println("Impartirea lui \"" + produs + "\" la \"" + aa + "\" este: " + impartire);
    }

    public String getRaspuns() {
        String mama = "Ivan Veronica";
        String tata = "Ivan Ruben-Ioan";
        if (mama.length() > tata.length()) {
            return mama;
        } else {
            return tata;
        }
    }

    public void switchMethode(int varsta) {
        switch (varsta) {
            case 1:
                System.out.println("Lara are varsta cea mai apropiata de valoare introdusa(" + varsta + ")");
                break;
            case 2:
                System.out.println("Levi are varsta cea mai apropiata de valoare introdusa(" + varsta + ")");
                break;
            case 3:
                System.out.println("Ruth are varsta cea mai apropiata de valoare introdusa(" + varsta + ")");
                break;
            case 4:
                System.out.println("Maria are varsta cea mai apropiata de valoare introdusa(" + varsta + ")");
                break;
            case 5:
                System.out.println("Paul are varsta cea mai apropiata de valoare introdusa(" + varsta + ")");
                break;
            default:
                System.out.println("Nu exista varsta pentru valoarea aleasa");

        }
    }

    public int switchMethode2(String nume) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 8;
        int e = 10;
        int z = 100;
        switch (nume) {
            case "Lara":
                return a;
            case "Levi":
                return b;
            case "Ruth":
                return c;
            case "Maria":
                return d;
            case "Paul":
                return e;
            default:
                return z;
        }
    }

    public void grafic() {
        int lungimeGraf = 9;
        int pozitieDreaptaSus = lungimeGraf / 2;
        int pozitieStangaSus = lungimeGraf / 2;
        int pozitieDreaptaJos = lungimeGraf / 2;
        int pozitieStangaJos = lungimeGraf / 2;

        for (int i = 0; i < lungimeGraf; i++) {
            for (int j = 0; j < lungimeGraf; j++) {
                if (j == pozitieStangaSus) {
                    System.out.print("*");
                }
                if (j == pozitieDreaptaSus) {
                    System.out.print("*");
                }
                System.out.print("|");
            }
            pozitieDreaptaSus++;
            pozitieStangaSus--;

            System.out.println("");
        }

    }

    public void jocaCuArray(int pozitie) {
        String[] listaNume = {"Ruben", "Andrada", "Paul", "Maria"};
        int[] listaVarsta = {38, 37, 10, 8};
        int pozitie2 = pozitie;
        System.out.println(listaNume[pozitie] + " are " + listaVarsta[pozitie] + " ani");
//        Arrays.sort(listaNume);
//        Arrays.sort(listaVarsta);
//        System.out.println(listaNume[pozitie]+" are "+ listaVarsta[pozitie] + " ani");

        if (pozitie == 3) {
            System.out.println("Lista are " + listaNume.length + " pozitii");
            int[] listaGoala = {};
            for (int i = 0; i < 5; i++) {
                Arrays.fill(listaGoala, i);
                System.out.println("Valoarea din lista goala a fost updatata la: " + i);
            }
        }

    }

    public void matrice() {
        int lungimeRand = 5;
        int lungimeColoana = 5;
        Random rand = new Random();

        for (int i = 0; i < lungimeRand; i++) {
            for (int j = 0; j < lungimeColoana; j++) {
                int randX = rand.nextInt(100);
                System.out.print(randX + "\t");
            }
            System.out.println();

        }

    }

    public void eachfor() {
        int[] numere = {1, 2, 3, 4};
        for (int sir : numere) {
            System.out.println(sir);
        }

        String[] nume = {"Ruben", "Andrada", "Paul", "Maria"};
        for (String sirnume : nume) {
            System.out.print(sirnume);
        }
    }

    public void builder() {
        StringBuilder builder = new StringBuilder("Curs ");
        StringBuilder builder2 = new StringBuilder(10);
        String java = "Java ";
        System.out.println(builder + java + " - inainte de append");
        builder = builder.append(java);
        builder = builder2.append(java);
        System.out.println(builder + " - dupa append");
        System.out.println(builder + java + " - dupa append + java");
        String nouBuilder = builder.toString();
        System.out.println(nouBuilder + " - to String");
        System.out.println(builder2);

        int[] listaNumere = {10, 4, 5, 3, 7, 7, 8, -3, -67};
        Arrays.sort(listaNumere);
        System.out.print("Sirul de numere ordonat crescator este: ");
        for (int i : listaNumere) {
            System.out.print(i + ", ");
        }
        int a = 5;
        int b = 10;
        System.out.println();
        System.out.println(a > b ? "10 este mai mic decat 5" : "10 este mai mare decat 5");
        System.out.println(b > b ? "5 este mai mic decat 10" : "5 este mai mare decat 10");
    }

    public void newSwithc() {
        int a = 10;
        switch (a) {
            case 0 -> {
                System.out.println("zero");
            }
            case 11 ->{
                System.out.println("unspe");
            }
            case 10 ->{
                System.out.println("zece");
            }
            default ->{
                System.out.println("no value");
            }
        }


        }
    int addTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        //System.out.println("suma este: " + result);
        return result;
    }

    int[] sortAndIncrementFunction(int[] inputArray){
        int[] result = new int[inputArray.length];

        for(int i=0; i < inputArray.length; i++){
            result[i] = inputArray[i]+1;
        }
        Arrays.sort(result);
        return result;

    }
}





























