package Entregable_U4;

import java.util.Arrays;

public class Preguntas {

    private String Enunciado;
    private Opciones [] Opciones;

    public Preguntas(String enunciado, Entregable_U4.Opciones[] opciones) {
        Enunciado = enunciado;
        Opciones = opciones;
        this.Opciones = new Opciones[3];
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public Entregable_U4.Opciones[] getOpciones() {
        return Opciones;
    }

    public void setOpciones(Entregable_U4.Opciones[] opciones) {
        Opciones = opciones;
    }


    @Override
    public String toString() {
        return "Preguntas{" +
                "Enunciado='" + Enunciado + '\'' +
                ", Opciones=" + Arrays.toString(Opciones) +
                '}';
    }
}
