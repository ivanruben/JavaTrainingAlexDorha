package Polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void metodaTest(){

        Caine labrador = new Caine("Marcel", "labrador", 7);
        labrador.faceSunet();

        Pisica europan =new Pisica("Ciki", "siameza", 4);
        europan.faceSunet();
        europan.manaca();
        europan.manaca("ciuperci");
        europan.manaca(500);

    }
}
