import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Coro c1 = new Coro("C1", "Pablo", "Pablo2", "Pabla", "Pinguinos", 3, 2, 40);
        Comparsa co1 = new Comparsa("co1", "Juan", "Andres", "Ana", "Osos", "Coo1", 42);
        Chirigota ch1 = new Chirigota("ch1","Alberto","Juan Alberto","Juan Alberta","Pandas",4,41);
        Cuarteto cu1 = new Cuarteto("cu1","Pepa","Pepe","Andres","Jirafas",8,38);
        Romancero r1 = new Romancero("r1","Jordi","Mike","Javier","Vampiros","Terror");

        System.out.println(c1);
        System.out.println(co1);
        System.out.println(ch1);
        System.out.println(cu1);
        System.out.println(r1);

        System.out.println("---------");

        c1.cantar_la_presentacion();
        co1.cantar_la_presentacion();
        ch1.cantar_la_presentacion();
        cu1.cantar_la_presentacion();
        r1.cantar_la_presentacion();

        System.out.println("---------");

        c1.hacer_tipo();
        co1.hacer_tipo();
        ch1.hacer_tipo();
        cu1.hacer_tipo();
        r1.hacer_tipo();

        System.out.println("---------");

        Integrantes i1 = new Integrantes(1,"Juan",23,"Bormujos");

        ch1.amo_a_escucha();
        cu1.amo_a_escucha();
        r1.amo_a_escucha();

        System.out.println("---------");

        c1.caminito_del_falla();
        co1.caminito_del_falla();
        ch1.caminito_del_falla();
        cu1.caminito_del_falla();

        System.out.println("---------");

        Coac coac1 = new Coac(new AgrupacionOficial[0]);

        coac1.incscribir_Agrupacion(c1);
        System.out.println(coac1);
        coac1.eliminar_agrupacion(c1);
        System.out.println(coac1);
    }
}
