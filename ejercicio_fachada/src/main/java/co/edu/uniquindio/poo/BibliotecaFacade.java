package co.edu.uniquindio.poo;


import java.util.ArrayList;

public class BibliotecaFacade {
    private BuscadorLibro buscador;

    public BibliotecaFacade(ArrayList<Libro> libros) {
        buscador = new BuscadorLibro(libros);
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