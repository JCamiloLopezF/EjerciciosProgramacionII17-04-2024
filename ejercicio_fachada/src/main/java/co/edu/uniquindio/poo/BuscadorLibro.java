package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuscadorLibro {

    private ArrayList<Libro> libros;
    public Libro libroEncontrado;

    public BuscadorLibro(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro lib : libros) {
            if (lib.getTitulo().equals(titulo)) {
                libroEncontrado = lib;
            }
        }

        return libroEncontrado;
    }

    public Libro buscarPorAutor(String autor) {
        for (Libro lib : libros) {
            if (lib.getAutor().equals(autor)) {
                libroEncontrado = lib;
            }
        }
        return libroEncontrado;
    }

    public Libro buscarPorCategoria(String categoria) {
        for (Libro lib : libros) {
            if (lib.getCategoria().equals(categoria)) {
                libroEncontrado = lib;
            }
        }
        return libroEncontrado;
    }
}