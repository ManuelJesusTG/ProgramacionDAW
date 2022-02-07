package Entregable_U4;

import java.util.Arrays;
import java.util.Calendar;

public class Examen {

    private Calendar Fecha = Calendar.getInstance();
    private String Consejeria;
    private String URL;
    private Preguntas [] Preguntas;
    private Sedes [] Sede;

    public Examen(String consejeria, String URL, Entregable_U4.Preguntas[] preguntas, Sedes[] sede) {
        Consejeria = consejeria;
        this.URL = URL;
        Preguntas = preguntas;
        Sede = sede;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar fecha) {
        Fecha = fecha;
    }

    public String getConsejeria() {
        return Consejeria;
    }

    public void setConsejeria(String consejeria) {
        Consejeria = consejeria;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Entregable_U4.Preguntas[] getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(Entregable_U4.Preguntas[] preguntas) {
        Preguntas = preguntas;
    }

    public Sedes[] getSede() {
        return Sede;
    }

    public void setSede(Sedes[] sede) {
        Sede = sede;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "Fecha=" + Fecha +
                ", Consejeria='" + Consejeria + '\'' +
                ", URL='" + URL + '\'' +
                ", Preguntas=" + Arrays.toString(Preguntas) +
                ", Sede=" + Arrays.toString(Sede) +
                '}';
    }
}
