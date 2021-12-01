import java.util.Scanner;

public class TerronGironExamenT1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int anchura;
        String Escudo;
        double Pescudo=2.50;
        double Envio=3.25;

        System.out.println("Bienvenidos a BanderaDeEspaña.es");
        System.out.println("Introduzca la altura de la bandera:");
        altura = sc.nextInt();
        System.out.println("Ahora introduzca la anchura");
        anchura = sc.nextInt();
        System.out.println("¿Quiere escudo bordado? (s/n):");
        Escudo = sc.next();
        if (Escudo.equals("s") || Escudo.equals("n")) {

            int cm2 = altura * anchura;
            double precio = cm2 * 0.01;
            double Totale = precio + Pescudo + Envio;
            double Totals = precio + Envio;

            System.out.println("Gracias. Aqui tiene el desglose de su compra.");
            System.out.println("Bandera de " + cm2 + " cm2: " + precio + " €");
            if (Escudo.equals("s")) {
                System.out.println("Con escudo: " + Pescudo + (" €"));
            } else if (Escudo.equals("n")) {
                System.out.println("Sin escudo: 0 €");
            }
            System.out.println("Gastos de envio : 3,25 €");
            if (Escudo.equals("s")) {
                System.out.println("Total: " + Totale + " €");
            } else if (Escudo.equals("n")) {
                System.out.println("Total: " + Totals + " €");
            }
        } else {
            System.out.println("No deja claro si quiere escudo o no");
        }
    }
}
