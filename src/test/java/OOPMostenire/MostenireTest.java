package OOPMostenire;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void metodaTest() {
        List<String> optiuniAsus = new ArrayList<>();
        optiuniAsus.add("dunga led");
        optiuniAsus.add("tastatura internationala");
        optiuniAsus.add("camera web");

        Asus g14 = new Asus("Oled", "dreptunghiulara", "G144",999.99, optiuniAsus);
        g14.getPret();
        g14.infoAsus();

        Lenovo tinkpad = new Lenovo("Oledddd", "dreptunghdddddiulara", "G1ddd44",9979.99, "HDMI");
        tinkpad.infoLenovo();
    }
}
