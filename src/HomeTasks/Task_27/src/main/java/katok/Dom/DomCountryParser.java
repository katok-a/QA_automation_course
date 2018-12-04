package katok.Dom;

import katok.Model.Country;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class DomCountryParser {
    public List<Country> parse(Document document) {
        List<Country> countries = new ArrayList<Country>();
        NodeList nodelist = document.getElementsByTagName("Country");
        for(int i=0; i<nodelist.getLength();i++){
            countries.add(getCountry(nodelist.item(i)));
        }
        return countries;
    }

    private static Country getCountry(Node node){
        Country country = new Country();
        Element element = (Element) node;
        country.setId(Integer.parseInt(element.getAttribute("id")));
        country.setCode(getTagValue("Code", element));
        country.setName(getTagValue("Name", element));
        country.setDescription(getTagValue("Description",element));
        return country;
    }
    private static String getTagValue(String tag, Element element){
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
        }
}
