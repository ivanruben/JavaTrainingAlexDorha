package Interfete;

public class PersoanaAngajat extends Persoana implements AngajatInt{
    public PersoanaAngajat(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul primeste salariu");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Angajatul isi ia concediu");
    }
}
