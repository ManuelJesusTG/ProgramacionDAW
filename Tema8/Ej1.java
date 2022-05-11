import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;

        List<Alumnos> alumnosList = new ArrayList<>();
        try {


            db = dbf.newDocumentBuilder();
            Document doc = db.parse("./XML/src/alumnos.xml");

            NodeList n1 = doc.getElementsByTagName("alumno");

            System.out.println("hay "+n1.getLength()+" Alumnos");

            for (int i = 0; i < n1.getLength() ; i++) {
                Integer DNI=0;
                String Nombre="";
                String Direccion="";

                Element e = (Element) n1.item(i);

                if (e.hasAttributes()){
                    NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j < nodeMap.getLength() ; j++) {
                        Node node = nodeMap.item(j);
                        Attr Atrib = e.getAttributeNode(node.getNodeName());
                        if (Atrib.getNodeName().equals("DNI")){
                            DNI = Integer.parseInt(Atrib.getValue());
                        }
                    }
                }
                NodeList n12 = n1.item(i).getChildNodes();
                for (int j = 0; j < n12.getLength() ; j++) {
                    if (n12.item(j).getNodeType()==Node.ELEMENT_NODE){
                        Element tag = (Element) n12.item(j);
                        if (tag.getTagName().equals("nombre")) {
                            Nombre = tag.getTextContent();
                        } else {
                            Direccion = tag.getTextContent();
                        }
                    }
                }
                alumnosList.add(new Alumnos(DNI,Nombre,Direccion));
            }

        } catch (Exception e){
            System.out.println("m");
            throw new RuntimeException(e);
        }
        System.out.println(alumnosList);
    }
}
