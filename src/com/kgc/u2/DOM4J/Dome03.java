package com.kgc.u2.DOM4J;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import java.util.List;

public class Dome03 {
    @Test
    public void test () throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("src\\Work02.xml");
        Element rootElement = document.getRootElement();
        List<Element> elementList = rootElement.elements();
        for(int a=0;a<elementList.size();a++){
            int j=elementList.get(a).elements().size();
            for(int k=0;k<j;k++){
                String text=elementList.get(a).elements().get(k).getText();
                System.out.println(text);
            }
        }
    }
}
