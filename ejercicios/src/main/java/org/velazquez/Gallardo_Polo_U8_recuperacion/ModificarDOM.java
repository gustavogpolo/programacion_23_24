package org.velazquez.Gallardo_Polo_U8_recuperacion;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ModificarDOM {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc =
                    db.parse(new File("file:///C:/Users/DAW_M/Desktop/programacion_23_24/ejercicios/src/main/java/org/velazquez/Gallardo_Polo_U8_recuperacion/personasXML.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLinea = doc.createTextNode("\n");

            Comment comentario = doc.createComment(" <!-- COMENTARIO AÑADIDO DESDE DOM -->");

            Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);

            root.insertBefore(comentario, primeraPersona);

            Element persona = doc.createElement("persona");
            persona.setAttribute("id", "4");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Gustavo Gallardo");

            Element edad = doc.createElement("edad");
            edad.setTextContent("19");

            persona.appendChild(nombre);

            persona.appendChild(edad);

            root.appendChild(persona);

            NodeList nl = doc.getElementsByTagName("persona");
            Node node = nl.item(nl.getLength() - 1);
            Element personaClonada = (Element) node.cloneNode(true);

            personaClonada.setAttribute("id", "5");

            root.appendChild(personaClonada);

            Element segundaPersona = (Element) doc.getElementsByTagName("persona").item(1);
            root.removeChild(segundaPersona);

            root.replaceChild(personaClonada, primeraPersona);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas =
                    new File("src/main/java/U8_xml_json/XML/ejercicios/modificandoDOM/nuevoPersonasXML.xml");
                    new File("src/main/java/org/velazquez/Gallardo_Polo_U8_recuperacion/dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
