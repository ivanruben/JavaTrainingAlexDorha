package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    // Structuri repetitive: for, while, do-while, foreach

    @Test
    public void metodaTest(){
        //afiseazaNumereFor();
        //afiseareNumereWhile();
        afiseareNumereDoWhile();
    }

    //afisam primele 100 de numere

    public void afiseazaNumereFor(){
        for (int index=1; index <= 100; index++)        {
            System.out.println("For - Numarul curent este: " + index);
        }
    }
    public void afiseareNumereWhile(){
        int index =1;
        while (index <= 100){
            System.out.println("While - Numarul curent este: " + index);
            index++;
        }
    }
    public void afiseareNumereDoWhile(){
        int index =1;
        do {
            System.out.println("Do While - Numarul curent este: " + index);
            index++;
        }
        while (index <= 100);
    }
}
