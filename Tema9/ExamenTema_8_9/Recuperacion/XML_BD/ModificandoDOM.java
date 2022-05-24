package XML_BD;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificandoDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();


            Document doc = db.parse("./ExamenRecuperacion3ev/src/XML_BD/Empleados.xml");

            Node root = doc.getDocumentElement();

            Node Sueldo = doc.createTextNode("Sueldo");
            Integer a =1000 + (int) (Math.random()*1000);
            System.out.println(a);
            Sueldo.setNodeValue(a.toString());
            root.appendChild(Sueldo);



            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource ori = new DOMSource(root);
            File file = new File("./ExamenRecuperacion3ev/src/XML_BD/resultado.xml");
            StreamResult des = new StreamResult(file);

            transformer.transform(ori,des);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }

}
