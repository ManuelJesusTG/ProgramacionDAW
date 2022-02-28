package EntregableTema5;

public class Personas {

    private Integer NIF;
    private String Nombre;
    private String Apellidos;
    private Integer ID=0;
    static int Contador=0;

    public Personas(Integer NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
        ID += ID+Contador++;
    }

    public Integer getNIF() {
        return NIF;
    }

    public void setNIF(Integer NIF) {
        this.NIF = NIF;
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "NIF=" + NIF +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
