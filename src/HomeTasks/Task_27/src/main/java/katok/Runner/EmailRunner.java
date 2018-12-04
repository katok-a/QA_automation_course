package katok.Runner;

import katok.Dom.DomCountryParser;
import katok.Dom.DomEmailParser;
import katok.Model.Country;
import katok.Model.Email;
import katok.Sax.CountryHandler;
import katok.Sax.EmailHandler;
import katok.Stax.CountryParser;
import katok.Stax.EmailParser;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class EmailRunner {
    private static final String EMAIL_XML = "emails.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException,
            XMLStreamException {
        System.out.println(" ========================= SAX parser ==============================");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        EmailHandler emailHandler = new EmailHandler();
        saxParser.parse(new File(EMAIL_XML), emailHandler);
        List<Email> emails = emailHandler.getEmails();
        emails.forEach(email -> System.out.println(email));
        System.out.println(" ============================== STAX parser =========================");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(EMAIL_XML));
        emails = new EmailParser().parse(xmlEventReader);
        emails.forEach(email-> System.out.println(email));
        System.out.println(" ============================== DOM parser =========================");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(EMAIL_XML);
        emails = new DomEmailParser().parse(document);
        for (Email email: emails) {
            System.out.println(email);
        }
    }

}