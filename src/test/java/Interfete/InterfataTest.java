package Interfete;

import org.testng.annotations.Test;

public class InterfataTest {

    @Test
    public void metodaTest(){
Persoana persoana = new Persoana("Ion","Barbu",45 );
PersoanaAngajat persoanaAngajat = new PersoanaAngajat("Vasile","Crocu",56 );
PersoanaStudent persoanaStudent = new PersoanaStudent("Gigi","Craca",55 );
PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Jibli","Toru",25 );

persoanaAngajat.munceste();
new
persoanaStudent.invata();
persoanaStudentAngajat.invata();
persoanaStudentAngajat.munceste();
    }
}
