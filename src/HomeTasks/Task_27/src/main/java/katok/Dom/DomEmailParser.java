package katok.Dom;

import katok.Model.Country;
import katok.Model.Email;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class DomEmailParser {
    public List<Email> parse(Document document) {
        List<Email> emails= new ArrayList<Email>();
        NodeList nodelist = document.getElementsByTagName("email");
        for(int i=0; i<nodelist.getLength();i++){
            emails.add(getEmail(nodelist.item(i)));
        }
        return emails;
    }

    private static Email getEmail(Node node){
        Email email= new Email();
        Element element = (Element) node;
        email.setRecepient(getTagValue("recepient", element));
        email.setSubject(getTagValue("subject", element));
        email.setText(getTagValue("text",element));
        return email;
    }
    private static String getTagValue(String tag, Element element){
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}
