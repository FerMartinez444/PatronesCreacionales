package ar.utn.fer.singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Database {
    INSTANCE;
    private final List<String> libros = Collections.synchronizedList(new ArrayList<>());

    public void addLibro(String libro){
        libros.add(libro);
    }
    public List<String> listarLibros(){
        return new ArrayList<>(libros);
    }
}
