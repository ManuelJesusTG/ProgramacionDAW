import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("./ExamenT89/src/restaurante.xml"));

            Node root = doc.getDocumentElement();
            Element Disponible = doc.createElement("Disponible");
            Disponible.setTextContent("Si");

            root.appendChild(Disponible);


            Element plato = doc.createElement("plato");
            Element nombre = doc.createElement("nombre");
            Element precio = doc.createElement("precio");

            plato.setAttribute("calorias","2000");
            nombre.setTextContent("Hamburguesa");
            precio.setTextContent("8.00");

            plato.appendChild(nombre);
            plato.appendChild(precio);
            plato.appendChild(Disponible);
            root.appendChild(plato);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();


            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource ori = new DOMSource(root);
            File restaurantecop = new File("./ExamenT89/src/Examen2.xml");
            StreamResult des = new StreamResult(restaurantecop);

            transformer.transform(ori,des);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}