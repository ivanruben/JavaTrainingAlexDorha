package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev ruben = new Elev("Ivan", "Ruben", 14);
        ruben.prezentareElev();
        Elev oana = new Elev("Borsan", "Oana", 14);
        oana.prezentareElev();
    }
}
