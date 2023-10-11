package ClasaAbstracta;

public class APersoanaStudentAngajat extends Persoana{
    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri");
    }

    @Override
    public void invata() {
        System.out.println("Studentul invata");

    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste Salariu");
    }
}
