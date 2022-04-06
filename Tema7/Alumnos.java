package EntregableFicherosCollections;

import java.util.Objects;

public class Alumnos {

    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String DNI;
    private String email;
    private String Curso;
    private String Dual;

    public Alumnos(String nombre, String apellidos, String direccion, String DNI, String email, String curso, String dual) {
        Nombre = nombre;
        Apellidos = apellidos;
        Direccion = direccion;
        this.DNI = DNI;
        this.email = email;
        Curso = curso;
        Dual = dual;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getDual() {
        return Dual;
    }

    public void setDual(String dual) {
        Dual = dual;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", DNI='" + DNI + '\'' +
                ", email='" + email + '\'' +
                ", Curso='" + Curso + '\'' +
                ", Dual='" + Dual + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return Nombre.equals(alumnos.Nombre) && Apellidos.equals(alumnos.Apellidos) && Direccion.equals(alumnos.Direccion) && DNI.equals(alumnos.DNI) && email.equals(alumnos.email) && Curso.equals(alumnos.Curso) && Dual.equals(alumnos.Dual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Apellidos, Direccion, DNI, email, Curso, Dual);
    }

}
