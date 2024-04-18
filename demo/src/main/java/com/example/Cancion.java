package com.example;

public class Cancion {
    String nombre;
    String artista;
    String album;

    String reproducir() {
        return "Reproducir sonido";
    }
    
    String pausar() {
        return "Pausar cancion";
    }
    
    String retroceder() {
        return "Retroceder cancion";
    }
}
