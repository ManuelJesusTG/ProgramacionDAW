public class Main {

    public static void main(String[] args) {

        Criptomoneda c1 = new Criptomoneda("Cri1","C1","1",0.50,3,"2014",6);
        Criptomoneda c2 = new Criptomoneda("Cri2","C2","2",0.80,40,"2020",5);
        Criptomoneda c3 = new Criptomoneda("Cri3","C3","3",0.30,20,"2010",4);

        Fiat f1 = new Fiat("Fia1","F1","4","Italia");
        Fiat f2 = new Fiat("Fia2","F2","5","Portugal");

        ParDeCotizacion p1 = new ParDeCotizacion(1.00,0.50,5.00,50,c1);
        ParDeCotizacion p2 = new ParDeCotizacion(2.00,3.50,10.00,70,c2);
        ParDeCotizacion p3 = new ParDeCotizacion(1.00,0.80,6.00,50,c3);
        ParDeCotizacion p4 = new ParDeCotizacion(3.00,2.50,2.00,50,f1);
        ParDeCotizacion p5 = new ParDeCotizacion(1.00,0.50,5.00,0,f2);


        Exchange.Mapa.put(c1.getSimbolo(),p1);
        Exchange.Mapa.put(c2.getSimbolo(),p2);
        Exchange.Mapa.put(c3.getSimbolo(),p3);
        Exchange.Mapa.put(f1.getSimbolo(),p4);
        Exchange.Mapa.put(f2.getSimbolo(),p5);






    }

}
