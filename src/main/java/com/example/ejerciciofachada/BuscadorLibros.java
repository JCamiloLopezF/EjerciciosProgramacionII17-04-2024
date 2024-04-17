package com.example.ejerciciofachada;
import java.util.ArrayList;

public class BuscadorLibros {

    private ArrayList<Libro> libros;

    public BuscadorLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void buscarPorTitulo(Libro libro) {
        for (Libro lib : libros) {
            if (lib.getTitulo().equals(libro.getTitulo())) {
                lib = lib;
            }
        }
    }

    public void buscarPorAutor(Libro libro) {
        for (Libro lib : libros) {
            if (lib.getAutor().equals(libro.getAutor())) {
                lib = lib;
            }
        }
    }

    public void buscarPorCategoria(Libro libro) {
        for (Libro lib : libros) {
            if (lib.getCategoria().equals(libro.getCategoria())) {
                lib = lib;
            }
        }
    }
}
