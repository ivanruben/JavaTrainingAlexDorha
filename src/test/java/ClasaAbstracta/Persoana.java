package ClasaAbstracta;

public abstract class Persoana {
    // Recunoastem o clasa abstracta dupa cuvantul ABSTRACT
    // Cls abs. poate sau nu sa contina metode abstracte
    // metodele pot sa fie void si return
    // putem avea constructor => nu putem face un obiect
    // o clasa abstracta se mosteneste
    // clasa care mosteneste clasa abstracta trebuie sa implementeze metodele abstracte
    // ca sa facem o metoda abstracta trebuie sa adaugam cuvantul ABSTRACT
    // putem avea diferite access controls(public, privat,protected...) pentru metodele implementate in ea


    public abstract void mergeLaCursuri();
    public abstract void invata();
    public abstract void munceste();
    public abstract void primesteSalariu();

    public void persoanaMajora(){
        System.out.println("Persoana este majora");
    }

}
