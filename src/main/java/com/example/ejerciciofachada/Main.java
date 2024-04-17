package com.example.ejerciciofachada;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Las penas de Pablo", "Whillhinton", "Acción");
        Libro libro2 = new Libro("Satanás", "Mendoza", "Terror");

        var lista1 = new ArrayList<Libro>();
        lista1.add(libro1);
        lista1.add(libro2);

        BibliotecaFacade facade = new BibliotecaFacade(lista1);

        Libro libroTitulo= facade.buscarPorTitulo("Satanás");
        Libro libroAutor = facade.buscarPorAutor("Mendoza");
        Libro libroCategoria = facade.buscarPorCategoria("Terror");

        System.out.println(libroAutor.toString());
    }
}
