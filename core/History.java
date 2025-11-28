package core;

import java.util.ArrayList;

public class History {

    private final ArrayList<String> historico = new ArrayList<>();

    public void add(String operacao) {
        historico.add(operacao);
    }

    public ArrayList<String> getAll() {
        return historico;
    }
}

