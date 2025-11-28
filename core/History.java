package core;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final ArrayList<String> items = new ArrayList<>();

    public void add(String entry) {
        items.add(entry);
    }

    public ArrayList<String> getAll() {
        return new ArrayList<>(items);
    }
}
