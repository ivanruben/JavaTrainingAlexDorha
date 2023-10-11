package zPractice;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Maria");
        person.setName("Paul");
        System.out.println(person.getName());
        System.out.println(person.getName());
    }
}


class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}