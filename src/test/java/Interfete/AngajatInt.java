package Interfete;

public interface AngajatInt{

  // Recunoastem o clasa dupa cuvantul Interface
  // O interfata poate avea doar metode abstracte
  // Metodele pot sa fie void sau return
  // NU AVEM CONSTUCTORI INTR-O INTERFATA => NU PUTEM FACE UN OBIECT
    // Clasa care implenmenteaza interfata => trebuie sa implementeze toate metodele din ea
    // O interfata se implementeaza prin folosirea cuvantului "implements"
    // In Java o clasa poate implementa n interfete
    // O CLASA ABSTRACTA POATE IMPLEMENTA O INTERFATA
    // metodele din interfata sunt publice
    // O interfata poate mosteni o alta interfata

    void munceste();
    void primesteSalar();
    void isiIaConcediu();

}
