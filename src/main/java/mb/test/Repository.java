package mb.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Repository<T> {

    private Database<T> db;

    Repository(Database<T> db) {
        this.db = db;
    }

    public Optional<T> get(int pesel) {
        List<T> items = db.getItems();
        for (T item : items) {
            if (item instanceof Person) {
                Person personItem = (Person) item;
                if (pesel == personItem.getPesel()) {
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }

//    public void get2(int pesel) {
//       Stream<T> items = db.getItems().stream();
//        items.map(item -> item instanceof Person)
//    }

    public List<T> getByName(String name) {
        return new ArrayList<>();
    }

    public boolean add(Person person) {
        return false;
    }

    public Optional<T> remove(int pesel) {
        return null;
    }

}
