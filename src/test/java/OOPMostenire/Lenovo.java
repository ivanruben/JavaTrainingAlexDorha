package OOPMostenire;

public class Lenovo extends Laptop{


    private String port;
    public Lenovo(String display, String forma, String model, double pret, String port) {
        super(display, forma, model, pret);
        this.port=port;
    }
    public void infoLenovo(){
        infoLaptop();
        System.out.println("Portul Lenovo este: "+port);
    }

    public String getPort() {
        return port;
    }
}
