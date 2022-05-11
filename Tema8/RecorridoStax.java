import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class RecorridoStax {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("./XML/alumnos.xml"));

            while(xmlReader.hasNext()){
                XMLEvent xmle = xmlReader.nextEvent();

            }


        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }

    }
}
