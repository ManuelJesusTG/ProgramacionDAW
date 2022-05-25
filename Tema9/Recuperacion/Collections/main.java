import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pasajeros p1 = new Pasajeros("Juan","Perez","123");
        Pasajeros p2 = new Pasajeros("Anto","Alvarez","456");
        Pasajeros p3 = new Pasajeros("Fred","Silva","789");
        Pasajeros p4 = new Pasajeros("Alberto","Pozo","135");
        Pasajeros p5 = new Pasajeros("Mario","Cima","689");
        Pasajeros p6 = new Pasajeros("Manu","Carrera","369");

        ArrayList<Pasajeros> pasajeros1 = new ArrayList<>();
        ArrayList<Pasajeros> pasajeros2 = new ArrayList<>();

        Vuelos v1 = new Vuelos(1,"Sevilla","Madrid","20/02/2022", pasajeros1 );
        Vuelos v2 = new Vuelos(2,"Cadiz","Valencia","10/02/2020", pasajeros2 );


        Metodos.addVuelo(v1);
        Metodos.addVuelo(v2);

        Metodos.addPasajero(1,p1);
        Metodos.addPasajero(1,p2);
        Metodos.addPasajero(1,p3);

        Metodos.MostrarXPasajeros();

        System.out.println("-----------------");

        Metodos.DelPasajero(1,p1);
        Metodos.MostrarXPasajeros();

    }
}
