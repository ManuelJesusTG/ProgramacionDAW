import java.util.Scanner;

public class EjercicioEntregable3_2021_MJTG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Precio=8;
        int PrecioM=5;
        int PrecioJ=11;
        String Descuento;
        int nentradas;
        String Dia;
        int PrecioR;

        System.out.println("Venta de entradas CineCampa");
        System.out.println("Numero de entradas= ");
        nentradas= sc.nextInt();
        System.out.println("Dia de la semana= ");
        Dia= sc.next();
        System.out.println("¿Tiene tarjeta CineCampa?");
        Descuento = sc.next();
        PrecioR=(((nentradas/2)*PrecioJ)+Precio);
        if (Dia.equals("Miercoles")){
            System.out.println("Aqui tiene sus entradas gracias por la compra");
            System.out.println("Entradas individuales= "+nentradas+" €");
            System.out.println("Total= "+nentradas*PrecioM+" €");
            if (Descuento.equals("Si")){
                System.out.println("Descuento= "+(nentradas*PrecioM)*0.10+" €");
                System.out.println("A pagar= "+(nentradas*PrecioM)*0.90+" €");
            }else {
                System.out.println("A pagar= "+nentradas*PrecioM+" €");
            }
        } else if (Dia.equals("Jueves")){
            System.out.println("Aqui tiene sus entradas gracias por la compra");
            if (nentradas%2==1){
                System.out.println("Entrada pareja= "+PrecioJ+" €");
                System.out.println("Total= "+(((nentradas/2)*PrecioJ)+Precio));
                if (Descuento.equals("Si")){
                    System.out.println("Descuento= "+(PrecioR)*0.10+" €");
                    System.out.println("A pagar= "+(PrecioR)*0.90+" €");
                } else {
                    System.out.println("A pagar= "+PrecioR+" €");
                }
            } else if (nentradas%2==0){
                System.out.println("Entrada pareja= "+PrecioJ+" €");
                System.out.println("Total= "+nentradas*PrecioJ+" €");
                if (Descuento.equals("Si")){
                    System.out.println("Descuento= "+(nentradas*PrecioJ)*0.10+" €");
                    System.out.println("A pagar= "+(nentradas*PrecioJ)*0.90+" €");
                } else {
                    System.out.println("A pagar= "+nentradas*PrecioJ+" €");
                }
            }
        } else {
            System.out.println("Aqui tiene sus entradas gracias por la compra");
            System.out.println("Entradas individuales= "+nentradas+" €");
            System.out.println("Total= "+nentradas*Precio +" €");
            if (Descuento.equals("Si")){
                System.out.println("Descuento= "+(nentradas*Precio)*0.10+" €");
                System.out.println("A pagar= "+(nentradas*Precio)*0.90+" €");
            } else {
                System.out.println("A pagar= "+nentradas*Precio+" €");
            }
        }
    }
}
