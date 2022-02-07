package Entregable_U4;

public class Main {
    public static void main(String[] args) {

        Opciones [] ope1 = new Opciones[3];

        Preguntas p1 = new Preguntas("¿Cuanto es 4-1?",ope1);

        System.out.println(p1);

        Opciones op1_1 = new Opciones("Verdadero",false);
        Opciones op1_2 = new Opciones("Falso",false);
        Opciones op1_3 = new Opciones("3",true);

        System.out.println(op1_3);

        Opciones [] ope2 = new Opciones[3];

        Preguntas p2 = new Preguntas("¿Lo sabes?",ope2);

        System.out.println(p2);

        Opciones op2_1 = new Opciones("Si",false);
        Opciones op2_2 = new Opciones("No",false);
        Opciones op2_3 = new Opciones("Nose",true);

        System.out.println(op2_3);


        Opositor o1 = new Opositor("Juan","Perez",2001);
        Opositor o2 = new Opositor("Pepe","Ruiz",2003,true,"Se eliminan la mitad de las preguntas");
        Opositor o3 = new Opositor("Andrea","Fernandez",1989,false);
        Opositor o4 = new Opositor("Jose","Ramirez",1940);


        System.out.println(o1);
        System.out.println(o2);

        Opositor [] grupo1 = new Opositor[2];
        Opositor [] grupo2 = new Opositor[2];

        Sedes s1 = new Sedes("1234",Ciudad.SEVILLA,grupo1,10);
        Sedes s2 = new Sedes("4321",Ciudad.SEVILLA,grupo2,10);

        System.out.println(s1);
        System.out.println(s2);

        Preguntas [] pre1 = new Preguntas[100];
        Sedes [] se1 = new Sedes[5];

        Examen E1 = new Examen("Alixar","Aulavirtual.com",pre1,se1);

        System.out.println(E1);
    }
}
