import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public abstract class Divisa implements Serializable, Comparator {

    private String Nombre;
    private String Simbolo;
    private String ID;

    public Divisa(String nombre, String simbolo, String ID) {
        Nombre = nombre;
        Simbolo = simbolo;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSimbolo() {
        return Simbolo;
    }

    public void setSimbolo(String simbolo) {
        Simbolo = simbolo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "Nombre='" + Nombre + '\'' +
                ", Simbolo='" + Simbolo + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divisa divisa = (Divisa) o;
        return Nombre.equals(divisa.Nombre) && Simbolo.equals(divisa.Simbolo) && ID.equals(divisa.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Simbolo, ID);
    }

    public abstract int compareTo(Object o);
}
