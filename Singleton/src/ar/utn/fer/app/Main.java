package ar.utn.fer.app;

import ar.utn.fer.abstractfactory.*;
import ar.utn.fer.factory.Libro;
import ar.utn.fer.factory.LogisticaLibro;
import ar.utn.fer.prototype.Prestamo;
import ar.utn.fer.singleton.*;
import ar.utn.fer.builder.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola soy un nuevo proyecto");

        //Parte 1

        Database db1 = Database.INSTANCE;
        Database db2 = Database.INSTANCE;

        db1.addLibro("El Principito");
        db2.addLibro("El Quijote");

        System.out.println("¿db1 y db2 son el mismo objeto? " + (db1 == db2));
        System.out.println("Libros en la DB: " + db1.listarLibros());

        //Parte 2

        Libro libro1 = LogisticaLibro.crearLibro("fisico", "El Diario de Greg", "Jef Kinney");
        Libro libro2 = LogisticaLibro.crearLibro("digital", "It", "Stephen King");

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        //Parte 3

        AbstractFactory adminFactory = new AdminFactory();
        AbstractFactory userFactory = new Usuarioactory();

        InterfazUI uiAdmin = adminFactory.crearUI();
        MetodoEnvio envioAdmin = adminFactory.crearEnvio();

        InterfazUI uiUser = userFactory.crearUI();
        MetodoEnvio envioUser = userFactory.crearEnvio();

        uiAdmin.mostrarPantalla();
        envioAdmin.enviar();

        uiUser.mostrarPantalla();
        envioUser.enviar();

        //Parte 4

        Usuario usuario1 = new Usuario ("Fer", "Martinez", 21, "fer.martinez.utn@gmail.com", "Maipu, Mendoza", "2617507567", "22/07/2004");

        Usuario usuario2 = new Usuario ("Francisco", "Acosta", 20, "fran.acosta@gmail.com", "Guaymallen, Mendoza", "2612493798", "10/02/2005");

        System.out.println(usuario1);
        System.out.println(usuario2);

        //Parte 5

        Libro libro = LogisticaLibro.crearLibro("fisico", "Los Juegos del Hambre", "Suzanne Collins");
        Prestamo prestamoOriginal = new Prestamo(libro, usuario1, "01/09/2025", "10/09/2025");

        Prestamo prestamo1 = prestamoOriginal.clone();
        Prestamo prestamo2 = prestamoOriginal.clone();

        prestamo1.setFechaInicio("02/09/2025");
        prestamo1.setFechaFin("12/09/2025");

        prestamo2.setFechaInicio("03/09/2025");
        prestamo2.setFechaFin("13/09/2025");

        System.out.println("Original: " + prestamoOriginal);
        System.out.println("Clon 1: " + prestamo1);
        System.out.println("Clon 2: " + prestamo2);
    }
}
