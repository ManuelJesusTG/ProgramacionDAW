package Entregable_U4;

public class Opciones {

    private String Texto;
    private boolean VF;

    public Opciones(String texto, boolean VF) {
        Texto = texto;
        this.VF = VF;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public boolean isVF() {
        return VF;
    }

    public void setVF(boolean VF) {
        this.VF = VF;
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "Texto='" + Texto + '\'' +
                ", VF=" + VF +
                '}';
    }
}
