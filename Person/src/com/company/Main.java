package com.company;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
	    Student Andrey = new Student(1);
	    Teacher Masha = new Teacher("Masha", 2, 2);
	    Masha.setType(TypeTeacher.professor);
	    Address Britain = new Address();
	    Britain.setAddress("Great Britain", "London");
	    Masha.setAddress(Britain);
		Student Sasha = new Student("Sasha", 3);
		Sasha.setType(TypeStudent.master);
		Masha.setAddress(Britain);
        PersonList list = new PersonList();
        list.AddPerson(Andrey);
        list.AddPerson(Masha);
        list.AddPerson(Sasha);
		Masha.Request(Andrey);
		Masha.Request(Sasha);
		Andrey.setCourseWork("Logical operators", "&&, ||, !");
		Sasha.setCourseWork("Kulish's life", "Biography");

		System.out.println("Teacher Masha");
		FileWriter f = new FileWriter("D:\\Person.txt");
		f.write("Info about Teacher Masha" + '\n');
		for (Person p: list.FindPersonByName("Masha").getList()) {
			System.out.println(p.toString());
			f.write(p.toString());
		}
		f.close();

		String body = "Person.xml";
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(new ByteArrayInputStream(body.getBytes()));
        NodeList nodeList = document.getElementsByTagName("Person");
        for (int i = 0, size = nodeList.getLength(); i < size; i++) {
            System.out.println(nodeList.item(i).getAttributes().getNamedItem("Name"));
        }
	}
}
// джейсон, ексемель