package main;

import exceptions.PubliInvalidaException;
import models.Biblioteca;
import models.Libro;
import models.Revista;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            // Agregar publicaciones
            biblioteca.agregarPublicacion(new Libro("Java Básico", 2020, 350, "Juan Pérez"));
            biblioteca.agregarPublicacion(new Revista("Tech Monthly", 2023, 100, 15));
            biblioteca.agregarPublicacion(new Libro("Algoritmos Avanzados", 2018, 500, "Laura García"));

            // Mostrar publicaciones
            System.out.println("=== Publicaciones en la Biblioteca ===");
            biblioteca.mostrarPublicaciones();

            // Buscar por título
            System.out.println("\n=== Buscar por Título: 'Java' ===");
            biblioteca.buscarPorTitulo("Java").forEach(System.out::println);

            // Ordenar por año
            System.out.println("\n=== Ordenar por Año de Publicación ===");
            biblioteca.ordenarPorAno().forEach(System.out::println);

            // Calcular total de páginas
            System.out.println("\nTotal de Páginas: " + biblioteca.calcularTotalPaginas());

        } catch (PubliInvalidaException e) {
            System.err.println("Error al agregar publicación: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos: " + e.getMessage());
        }
    }
}
