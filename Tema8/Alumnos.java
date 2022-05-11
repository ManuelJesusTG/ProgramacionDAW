import java.util.Objects;

public class Alumnos {

    private Integer DNI;
    private String nombre;
    private String Direccion;

    public Alumnos(Integer DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        Direccion = direccion;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return DNI.equals(alumnos.DNI) && nombre.equals(alumnos.nombre) && Direccion.equals(alumnos.Direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, nombre, Direccion);
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
