package com.example.ejerciciofachada;

import java.util.ArrayList;

public class BibliotecaFacade {
    private BuscadorLibros buscador;

    public BibliotecaFacade(ArrayList<Libro> libros) {
        buscador = new BuscadorLibros(libros);
    }

    public Libro buscarPorTitulo (Libro titulo) {
        buscador.buscarPorTitulo(titulo);
        return titulo;
    }

    public Libro buscarPorAutor(Libro autor) {
        buscador.buscarPorAutor(autor);
        return autor;
    }

    public Libro buscarPorCategoria(Libro categoria) {
        buscador.buscarPorCategoria(categoria);
        return categoria;
    }
}
