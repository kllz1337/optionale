package mb.test;

import java.util.List;

public class Database<T> {
    private List<T> items;

    Database(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }
}
