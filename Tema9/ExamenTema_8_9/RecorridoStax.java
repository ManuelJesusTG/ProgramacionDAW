import javax.sql.rowset.spi.XmlReader;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {

    public static void main(String[] args) {

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("./ExamenT89/src/restaurante.xml"));


            int contador=0;
            while (xmlReader.hasNext()){
                contador++;
                xmlReader.nextEvent();
            }
            System.out.println("Hay "+contador+" Platos en la carta");


        } catch (XMLStreamException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
