import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Pasajeros implements Serializable, Comparator {

    private String Nombre;
    private String Apellidos;
    private String DNI;

    public Pasajeros(String nombre, String apellidos, String DNI) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public int compare(Object o, Object t1) {

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajeros pasajeros = (Pasajeros) o;
        return Nombre.equals(pasajeros.Nombre) && Apellidos.equals(pasajeros.Apellidos) && Objects.equals(DNI, pasajeros.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Apellidos, DNI);
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }

}
