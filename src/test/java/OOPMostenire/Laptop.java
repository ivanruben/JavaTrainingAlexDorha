package OOPMostenire;

public class Laptop {
// incapsularea datelor = conceptul prin care tinem departe de exterior anumite variabile si valorile acestora.
    // private : este un access control care limiteaza accesul doar pentru aceasta clasa.
    // ca sa accesam/ modificam variabilele/valorile ne folosim de conceptul get/set.
    private String display;
    private String forma;
    private String model;
    private double pret;

    public Laptop(String display, String forma, String model, double pret) {
        this.display = display;
        this.forma = forma;
        this.model = model;
        this.pret = pret;
    }

    public void infoLaptop() {
        System.out.println("Dispaly-ul laptopului este: " + display);
        System.out.println("Forma laptopului este: " + forma);
        System.out.println("Modelul laptopului este: " + model);
        System.out.println("Pretul laptopului este: " + pret);
    }

    public String getDisplay() {
        return display;
    }

    public String getForma() {
        return forma;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
