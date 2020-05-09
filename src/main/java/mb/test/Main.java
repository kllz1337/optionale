package mb.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create list of people and print them
        List<Person> people = createPeople();

        // create db and repository
        Database<Person> db = new Database<>(people);
        PersonRepository personRepository = new PersonRepository(db);

//        personRepository.get2(102).ifPresent(person -> System.out.println(person));
        System.out.println(personRepository.getIdentityByPesel(101).orElse("kibel"));
    }

    private static List<Person> createPeople() {
        Person person1 = new Person(101, "Joanna", "Murek", 7500.0);
        Person person2 = new Person(102, "Paw", "Murek", 3500.0);
        Person person3 = new Person(103, "Burek", "Drzewo", 1000.0);
        Person person4 = new Person(104, "Jurek", "Stolc", 6000.0);
        Person person5 = new Person(105, "Joanna", "Ziemniak", 2000.0);
        Person person6 = new Person(106, "Paiotr", "Murek", 5500.0);
        return new ArrayList<>(List.of(person1, person2, person3, person4, person5, person6));
    }
}
