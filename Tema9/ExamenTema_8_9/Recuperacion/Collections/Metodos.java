import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Metodos {

    static HashMap<Integer,Vuelos> Map_Vuelos = new HashMap<>();

    public static boolean addVuelo(Vuelos o){
        Boolean Respuesta = true;
        for (Integer i: Map_Vuelos.keySet()) {
            if (o.getCodigo_Vuelo().equals(i)){
                Respuesta = false;
                break;
            }
        }
        Map_Vuelos.put(o.getCodigo_Vuelo(),o);
        System.out.println(Respuesta);
        return Respuesta;
    }

    public static boolean addPasajero(Integer Codigo, Pasajeros p){

        Boolean Respuesta = true;

        for (Vuelos i: Map_Vuelos.values()) {
            Iterator<Pasajeros> it = i.getPasajeros().iterator();
            while (it.hasNext()){
                if (it.next().equals(p)){
                    Respuesta = false;
                    return Respuesta;
                }
            }
        }

        Map_Vuelos.get(Codigo).getPasajeros().add(p);
        System.out.println("Se ha añadido el pasajero");
        return Respuesta;
    }

    public static boolean DelPasajero(Integer Codigo, Pasajeros p){

        Boolean Respuesta = false;

        for (Vuelos i: Map_Vuelos.values()) {
            Iterator<Pasajeros> it = i.getPasajeros().iterator();
            while (it.hasNext()){
                if (it.next().equals(p)){
                    Map_Vuelos.get(Codigo).getPasajeros().remove(p);
                    Respuesta = true;
                    return Respuesta;
                }
            }
        }
        return Respuesta;
    }

    public static void MostrarXPasajeros(){
        for (Vuelos i: Map_Vuelos.values()) {
            System.out.println(i.getCodigo_Vuelo());
            System.out.println(i.getPasajeros().toString());
        }
    }

    public static void Guardar_Datos(){
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("sae.dat"));
            OOS.writeObject(Map_Vuelos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Cargar_Datos(){
        try {
            ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("sae.dat"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
