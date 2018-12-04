package katok.Stax;

import katok.Model.Email;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EmailParser {
    private final static String EMAIL = "email";
    private final static String RECEPIENT = "recepient";
    private final static String SUBJECT = "subject";
    private final static String TEXT = "text";
    private Email email;
    public List<Email> emails= new ArrayList<Email>();

    public List<Email> parse(XMLEventReader xmlEventReader) throws FileNotFoundException, XMLStreamException {
        while (xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextEvent();
            proceedStartElement(xmlEvent, xmlEventReader);
            proceedEndElement(xmlEvent);
        }
        return emails;
    }

    private void proceedStartElement(XMLEvent xmlEvent, XMLEventReader xmlEventReader) throws XMLStreamException {
        if (xmlEvent.isStartElement()) {
            StartElement startElement = xmlEvent.asStartElement();
            if (isTagNameEqual(startElement, EMAIL)) {
                email = new Email();
            } else if (isTagNameEqual(startElement, RECEPIENT)) {
                email.setRecepient(xmlEventReader.nextEvent().asCharacters().getData());
            } else if (isTagNameEqual(startElement, SUBJECT)) {
                email.setSubject(xmlEventReader.nextEvent().asCharacters().getData());
            } else if (isTagNameEqual(startElement, TEXT)) {
                email.setText(xmlEventReader.nextEvent().asCharacters().getData());
            }
        }
    }

    private void proceedEndElement(XMLEvent xmlEvent) {
        if (xmlEvent.isEndElement()) {
            EndElement endElement = xmlEvent.asEndElement();
            if (endElement.getName().getLocalPart().equals(EMAIL)) {
                emails.add(email);
            }
        }
    }

    private boolean isTagNameEqual(StartElement startElement, String tagName) {
        return startElement.getName().getLocalPart().equals(tagName);
    }
}
