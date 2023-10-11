package Interfete;

public class PersoanaStudentAngajat extends Persoana implements AngajatInt, StudentInt{

    public PersoanaStudentAngajat(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Studentul angajat primeste salar");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Studentul angajat isi ia concediu");
    }

    @Override
    public void invata() {
        System.out.println("Studentul angajat invata");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul angajat primeste bursa");
    }

    @Override
    public void daExamene() {
        System.out.println("Studentul angajat da examen");
    }
}
