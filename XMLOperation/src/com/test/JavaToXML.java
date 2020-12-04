package com.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXML {

	public static void main(String[] args) {
	
		Employeee e1 = new Employeee();
		e1.setId(1001);
		e1.setName("jabir");
		e1.setSalary(100000);
		
		try {
			
			File file = new File("C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\EmployeXML.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employeee.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(e1, file);
			marshaller.marshal(e1, System.out);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
