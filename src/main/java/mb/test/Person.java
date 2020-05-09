package mb.test;

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

    public int getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
}
