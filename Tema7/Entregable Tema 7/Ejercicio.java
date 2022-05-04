package EntregableFicherosCollections;

import EjercicioFicheroBinario.Persona;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        Map<String,String> a = new HashMap<>();

        try {
            in = new ObjectInputStream(new FileInputStream("alumnos.dat"));
        } catch (IOException e){
            System.out.println("Error con el fichero");
        }

        Integer Opcion=0;

        while (Opcion!=6) {

            System.out.println("--Selecciona una opcion--");
            System.out.println("1.- Insertar alumno");
            System.out.println("2.- Borrar Alumno");
            System.out.println("3.- Mostrar Alumno");
            System.out.println("4.- Mostrar Alumnos de un curso");
            System.out.println("5.- Modificar alumno");
            System.out.println("6.- Salir");
            System.out.println("Elige una Opcion");

            Opcion = sc.nextInt();

            if (Opcion==1){
                Alumnos Alum =insertarAlumno();
                a.put(Alum.getDNI(), Alum.getNombre());
            }
            else if (Opcion==2){
                BorrarAlumno(a);
            }
             else if (Opcion==3){
                MostrarAlumnos(a);
            }


            else if (Opcion==6){
                break;
            }
            else if (Opcion>6 || Opcion<1){
                System.out.println("No existe esa opcion");
            }
        }

        try {
            out = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
           out.writeObject(a);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

    }
    public static Alumnos insertarAlumno() {
        Scanner sc = new Scanner(System.in);
        String Nombre, Apellidos, Direccion, DNI, Email, Curso, Dual;

        System.out.println("Introduce el nombre");
        Nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        Apellidos = sc.nextLine();
        System.out.println("Introduce la direccion");
        Direccion = sc.nextLine();
        System.out.println("Introduce el DNI");
        DNI = sc.nextLine();
        System.out.println("Introduce el Email");
        Email = sc.nextLine();
        System.out.println("Introduce el Curso");
        Curso = sc.nextLine();
        System.out.println("¿El alumno va a dual? S/N");
        Dual = sc.nextLine();

        return new Alumnos(Nombre, Apellidos, Direccion, DNI, Email, Curso, Dual);

    }

    public static void BorrarAlumno(Map<String,String> a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del alumno");
        String Dni = sc.nextLine();
        if (a.containsKey(Dni)) {
            a.remove(Dni);
            System.out.println("Alumno Borrado");
        } else {
                System.out.println("No existe ningun alumno con ese DNI");
            }
        }
    public static void MostrarAlumnos(Map<String,String> a){
        System.out.println(a.toString());
    }
    public static void MostrarAlumnosCurso(String Curso){

    }
}

