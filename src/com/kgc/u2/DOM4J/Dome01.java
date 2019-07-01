package com.kgc.u2.DOM4J;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dome01 {
    @Test
    public void test() throws DocumentException {
        //创建解析器
        SAXReader saxReader=new SAXReader();
        //加载xml文件
        Document document = saxReader.read("src\\dome01.xml");
        //获取根节点
        Element rootElement = document.getRootElement();
        //获取子节点
        List<Element> elementList = rootElement.elements();
        //遍历子节点
        for (Element e:elementList){
            Element name = e.element("name");
            Element sex = e.element("sex");
            System.out.println(name.getText()+" "+sex.getText());
        }
    }
}
