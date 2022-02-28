package EntregableTema5;

public class Main {
    public static void main(String[] args) {

        Personas p1 = new Personas(93431,"Juan","Perez");
        Personas p2 = new Personas(95453,"Rosa","Pascal");
        Personas p3 = new Personas(89654,"Ivan","Albaricoque");
        Personas p4 = new Personas(34859,"Alberta","Rodriguez");


        Personas[] gp1 = new Personas[0];
        Personas[] gp2 = new Personas[0];

        Vivienda v1 = new Vivienda(1999,"Calle Alberto",4000,3,8,20,200000,gp1);
        Vivienda v2 = new Vivienda(2004,"Calle Rodolfo",5000,2,9,23,50000,gp2);
        LocalComercial L1 = new LocalComercial(2000,"Calle Sevilla",30,p3,40000,"Tienda de Zumos");


        v1.mostrarPropiedad();

        v1.AddPersona(p1);

        System.out.println(v1);
        v1.MostrarPrecioVenta();
        L1.MostrarPrecioVenta();
        System.out.println();

        Propiedad[] pr1 = {v1,v2,L1};

        Registro r1 = new Registro(pr1);

        System.out.println(r1);

        System.out.println();

        r1.informeSuperficie();
    }
}
