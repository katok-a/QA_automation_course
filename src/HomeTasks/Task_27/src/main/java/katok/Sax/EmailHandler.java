package katok.Sax;

import katok.Model.Country;
import katok.Model.Email;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class EmailHandler extends DefaultHandler {
    private Email email;
    List<Email> mailList;
    boolean bRecepient = false;
    boolean bSubject = false;
    boolean bText = false;

    public List<Email> getEmails(){
        return mailList;
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("email")) {
            email = new Email();
            if (mailList == null) {
                mailList = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("recepient")) {
            bRecepient = true;
        } else if (qName.equalsIgnoreCase("subject")) {
            bSubject = true;
        } else if (qName.equalsIgnoreCase("text")) {
            bText = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("email")) {
            mailList.add(email);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bRecepient) {
            email.setRecepient(new String(ch, start, length));
            bRecepient= false;
        } else if (bSubject) {
            email.setSubject(new String(ch, start, length));
            bSubject = false;
        } else if (bText) {
            email.setText(new String(ch, start, length));
            bText = false;
        }
    }

}
