package Obiect;
import org.testng.annotations.Test;

public class FabricaMasinaTest {
    @Test
    public void metodaTest(){
        System.out.println(

        );
        FabricaMasini audiA3 = new FabricaMasini("Audi", "A3", 2023, "Morotina","Argintiu");
        audiA3.prezentareMasina();
        System.out.println();
        FabricaMasini bmwX5 = new FabricaMasini("BMW", "X5", 2022, "benzina", "gri");
        bmwX5.prezentareMasina();
        System.out.println();
        FabricaMasini volovXC90 = new FabricaMasini("Volvo","XC90", 2024, "Hybrid", "Alb",70000);
        volovXC90.prezentareMasina();
}
}

