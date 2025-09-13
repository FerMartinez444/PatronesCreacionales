package ar.utn.fer.factory;

public class LibroFisico implements Libro {
    private String titulo;
    private String autor;

    public LibroFisico(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String getTitulo(){
        return titulo;
    }

    @Override
    public String getAutor(){
        return autor;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Libro Físico: "+ titulo + " - " + autor);
    }
}
