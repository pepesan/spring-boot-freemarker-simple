package com.cursosdedesarrollo.webexample;

import java.util.Objects;

public class Dato {
    private String cadena;

    public Dato() {
        this.cadena = "";
    }

    public Dato(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "Dato{" +
                "cadena='" + cadena + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dato dato = (Dato) o;
        return Objects.equals(cadena, dato.cadena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadena);
    }
}
