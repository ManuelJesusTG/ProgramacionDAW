import java.util.Scanner;

public class EjercicioEntregable_2021_MJTG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Introduce la altura de la Z");
        altura = sc.nextInt();
        int espacios=altura-1;
        int espacios2=altura-1;

        if (altura >3 && altura%2 == 1) {
        for (int i = 0; i < altura ; i++) {
            if (i == 0 || i == altura - 1) {
                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < espacios2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < espacios2; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
            espacios--;
            }
        } else {
            System.out.println("Error la altura no es mayor que 3 o impar");
        }
    }
}
