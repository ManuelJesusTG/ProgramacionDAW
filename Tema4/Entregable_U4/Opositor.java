package Entregable_U4;

import java.util.Calendar;

public class Opositor {

    private String nombre;
    private String apellidos;
    private int anio;
    private boolean adaptacion;
    private String Descripcion;

    public Opositor(String nombre, String apellidos, int anio, boolean adaptacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio = anio;
        this.adaptacion = adaptacion;
        Descripcion = descripcion;
    }

    public Opositor(String nombre, String apellidos, int anio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio = anio;
    }

    public Opositor(String nombre, String apellidos, int anio, boolean adaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio = anio;
        this.adaptacion = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anio=" + anio +
                ", adaptacion=" + adaptacion +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
