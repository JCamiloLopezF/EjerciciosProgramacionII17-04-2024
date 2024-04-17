package com.example.ejerciciofachada;

import java.util.ArrayList;

public class BibliotecaFacade {
    private BuscadorLibros buscador;

    public BibliotecaFacade(ArrayList<Libro> libros) {
        buscador = new BuscadorLibros(libros);
    }

    public Libro buscarPorTitulo (String titulo) {
        return buscador.buscarPorTitulo(titulo);
    }

    public Libro buscarPorAutor(String autor) {
        return buscador.buscarPorAutor(autor);
    }

    public Libro buscarPorCategoria(String categoria) {
        return buscador.buscarPorCategoria(categoria);
    }
}
