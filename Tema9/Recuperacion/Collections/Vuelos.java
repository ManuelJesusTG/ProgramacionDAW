import java.util.ArrayList;
import java.util.Arrays;

public class Vuelos {

    private Integer Codigo_Vuelo;
    private String Origen;
    private String Destino;
    private String Fecha;
    private ArrayList <Pasajeros> pasajeros;

    public Vuelos(Integer codigo_Vuelo, String origen, String destino, String fecha, ArrayList<Pasajeros> pasajeros) {
        Codigo_Vuelo = codigo_Vuelo;
        Origen = origen;
        Destino = destino;
        Fecha = fecha;
        this.pasajeros = pasajeros;
    }

    public Integer getCodigo_Vuelo() {
        return Codigo_Vuelo;
    }

    public void setCodigo_Vuelo(Integer codigo_Vuelo) {
        Codigo_Vuelo = codigo_Vuelo;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public ArrayList<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajeros> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "Codigo_Vuelo=" + Codigo_Vuelo +
                ", Origen='" + Origen + '\'' +
                ", Destino='" + Destino + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
