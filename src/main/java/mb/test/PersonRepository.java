package mb.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRepository {

    private Database<Person> db;

    PersonRepository(Database<Person> db) {
        this.db = db;
    }

    public Optional<Person> get(int pesel) {
        List<Person> items = db.getItems();
        for (Person item : items) {
            if (pesel == item.getPesel()) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> get2(int pesel) {
        return db.getItems()
                .stream()
                .filter(person -> person.getPesel() == pesel)
                .findAny();
    }

    public Optional<String> getIdentityByPesel(int pesel) {
        Optional<Person> optionalPerson = db.getItems()
                .stream()
                .filter(person -> pesel == person.getPesel())
                .findFirst();

//        return optionalPerson
//                .map(person -> buildOptionalPersonIdentity(person));
        return optionalPerson
                .flatMap(person -> buildOptionalPersonIdentity(person));
    }

    private String buildPersonIdentity(Person person) {
        return String.format("%s %s", person.getName(), person.getSurname());
    }

    private Optional<String> buildOptionalPersonIdentity(Person person) {
        return Optional.of(String.format("%s %s", person.getName(), person.getSurname()));
    }

    public List<Person> getByName(String name) {
        return new ArrayList<>();
    }

    public boolean add(mb.test.Person person) {
        return false;
    }

    public Optional<Person> remove(int pesel) {
        return null;
    }
}
