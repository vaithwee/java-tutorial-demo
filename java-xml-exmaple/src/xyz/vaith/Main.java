package xyz.vaith;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Main {

    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read("xml/student.xml");
            Element rootElement = document.getRootElement();
            traversesElement(rootElement);
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            
        }

    }

    private static void traversesElement(Element rootElement) {
        for (Element element : rootElement.elements()) {
            if (element.isTextOnly()) {
                System.out.println(element.getName() + ": " + element.getText());
            } else {
                traversesElement(element);
            }
        }
    }
}
