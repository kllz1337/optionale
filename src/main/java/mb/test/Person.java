package mb.test;

import java.util.Objects;

public class Person {
    private final int pesel;
    private final String name;
    private final String surname;
    private final double salary;

    Person(int pesel, String name, String surname, double salary) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + pesel + ", " + name + " " + surname + ", " + salary + '}';
    }
}
