import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exchange {

    static Map<String, ParDeCotizacion> Mapa;


    public void mostrarDivisasOrdenadas() {
        Iterator<Iterator> it;
        System.out.println(Mapa.values());
    }

    public void obtenerCotizaciones (String Simbolo){
        if (Mapa.containsKey(Simbolo)){
            System.out.println(Mapa.values());
        } else {
            System.out.println("No se encuentra el Simbolo");
        }
    }

    public void mostrarCotizacionesAlAlzaUnaHora(ParDeCotizacion cotizacion){
        if (cotizacion.getVariacionPorcentual()>0){
            System.out.println(Mapa.values());
        }
    }

    public void addCotizacion(ParDeCotizacion cotizacion){
        new ParDeCotizacion(cotizacion.getDivisaBase(), cotizacion.getDivisaCotizada(), cotizacion.getPrecio(), cotizacion.getVariacionPorcentual(), cotizacion.getDivisa());
    }

    public void guardarCotizaciones(){
        try {
            FileOutputStream Fw = new FileOutputStream("cotizaciones.dat");

        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

}
