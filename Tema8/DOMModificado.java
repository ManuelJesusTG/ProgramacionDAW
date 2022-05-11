import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOMModificado {
    public static void main(String[] args) throws ParserConfigurationException {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse("./XML/src/alumnos.xml");

            Node root = doc.getDocumentElement();
            Text Salto = doc.createTextNode("\n");



            Element alumno = doc.createElement("Instituto");
            alumno.setAttribute("dni=","4312");
            Element Nombre = doc.createElement("Nombre");
            Nombre.setTextContent("Manuel Jesus");
            Element Apellidos = doc.createElement("Apellidos");
            Nombre.setTextContent("Terron Giron");
            Element Direccion = doc.createElement("Direccion");
            Nombre.setTextContent("Cerca");

            alumno.appendChild(Nombre);
            alumno.appendChild(Apellidos);
            alumno.appendChild(Direccion);

            root.appendChild(alumno);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            File Fichero = new File("./XML/src/alumnosModificado");
            StreamResult destino = new StreamResult(Fichero);

            transformer.transform(origen,destino);

        }catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }


    }
}
