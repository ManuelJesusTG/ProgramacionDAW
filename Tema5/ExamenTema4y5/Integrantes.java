import java.util.Objects;

public class Integrantes {

    private Integer NParticipante;
    private String Nombre;
    private Integer Edad;
    private String Localidad;

    public Integrantes(Integer NParticipante, String nombre, Integer edad, String localidad) {
        this.NParticipante = NParticipante;
        Nombre = nombre;
        Edad = edad;
        Localidad = localidad;
    }

    public Integer getNParticipante() {
        return NParticipante;
    }

    public void setNParticipante(Integer NParticipante) {
        this.NParticipante = NParticipante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrantes{" +
                "NParticipante=" + NParticipante +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Localidad='" + Localidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrantes that = (Integrantes) o;
        return Objects.equals(NParticipante, that.NParticipante) && Objects.equals(Nombre, that.Nombre) && Objects.equals(Edad, that.Edad) && Objects.equals(Localidad, that.Localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NParticipante, Nombre, Edad, Localidad);
    }
}
