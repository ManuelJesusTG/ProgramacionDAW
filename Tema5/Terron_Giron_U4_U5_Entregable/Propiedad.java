package EntregableTema5;

import ej.Pelicula;

import java.util.Objects;

public abstract class Propiedad implements Comparable <Propiedad> {

    private Integer AnioConstruccion;
    private String Direccion;
    private Integer MetrosCuadrados;

    public Propiedad(Integer anioConstruccion, String direccion, Integer metrosCuadrados) {
        AnioConstruccion = anioConstruccion;
        Direccion = direccion;
        MetrosCuadrados = metrosCuadrados;
    }

    public Integer getAnioConstruccion() {
        return AnioConstruccion;
    }

    public void setAnioConstruccion(Integer anioConstruccion) {
        AnioConstruccion = anioConstruccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getMetrosCuadrados() {
        return MetrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        MetrosCuadrados = metrosCuadrados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return AnioConstruccion.equals(propiedad.AnioConstruccion) && Direccion.equals(propiedad.Direccion) && MetrosCuadrados.equals(propiedad.MetrosCuadrados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AnioConstruccion, Direccion, MetrosCuadrados);
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "AnioConstruccion=" + AnioConstruccion +
                ", Direccion='" + Direccion + '\'' +
                ", MetrosCuadrados=" + MetrosCuadrados +
                '}';
    }


    abstract void mostrarPropiedad();

    @Override
    public int compareTo(Propiedad Propiedad) {
        return Propiedad.getMetrosCuadrados()-this.getMetrosCuadrados();
    }

}
