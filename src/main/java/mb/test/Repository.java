package mb.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository<T> {

    private Database db;

    Repository(Database db) {
        this.db = db;
    }

    public Optional<T> get(int pesel) {
        return null;
    }

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
