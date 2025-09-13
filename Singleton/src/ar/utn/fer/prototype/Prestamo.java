package ar.utn.fer.prototype;

import ar.utn.fer.builder.Usuario;
import ar.utn.fer.factory.Libro;

public class Prestamo implements Cloneable {
    private Libro libro;
    private Usuario usuario;
    private String fechaInicio;
    private String fechaFin;

    public Prestamo(Libro libro, Usuario usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Error al clonar el préstamo");
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + (libro != null ? libro : "N/A") +
                ", usuario=" + (usuario != null ? usuario.getNombre() + " " + usuario.getApellido() : "N/A") +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }
}

