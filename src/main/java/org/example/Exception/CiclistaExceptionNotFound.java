package org.example.Exception;

public class CiclistaExceptionNotFound extends Exception {
    private int dorsal;

    public CiclistaExceptionNotFound(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String getMessage() {
        return "No se pudo encontrar el dorsal: " + this.dorsal;
    }
}
