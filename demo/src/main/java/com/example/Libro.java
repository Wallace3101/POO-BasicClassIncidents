package com.example;

public class Libro {
    String titulo;
    String autor;
    String isbn;

    String obtenerInformacion() {
        return "Obtener informacion";
    }
    
    String prestar() {
        return "Prestar informacion";
    }
    
    String devolver() {
        return "Devolver informacion";
    }
}
