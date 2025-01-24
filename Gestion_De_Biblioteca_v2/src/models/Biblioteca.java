package models;

import exceptions.PubliInvalidaException;
import interfaces.GestionPublicaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca implements GestionPublicaciones<Publicacion> {
    private List<Publicacion> publicaciones;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    @Override
    public void agregarPublicacion(Publicacion publicacion) throws PubliInvalidaException {
        if (publicacion == null) {
            throw new PubliInvalidaException("La publicación no puede ser nula.");
        }
        publicaciones.add(publicacion);
    }

    @Override
    public List<Publicacion> buscarPorTitulo(String titulo) {
        return publicaciones.stream()
                .filter(p -> p.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Publicacion> ordenarPorAno() {
        return publicaciones.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAnoPublicacion(), p2.getAnoPublicacion()))
                .collect(Collectors.toList());
    }

    @Override
    public int calcularTotalPaginas() {
        return publicaciones.stream()
                .mapToInt(Publicacion::getPaginas)
                .sum();
    }

    public void mostrarPublicaciones() {
        publicaciones.forEach(System.out::println);
    }
}
