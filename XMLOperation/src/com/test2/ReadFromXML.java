package com.test2;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadFromXML {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Users.class);
			Unmarshaller unmarshall = context.createUnmarshaller();
			File file = new File("C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\LoginData.xml");
			
			Users users = (Users) unmarshall.unmarshal(file);
			
			List<User> userList = users.getUsers();
			for(User u: userList) {
				
				System.out.println(u.getUsername()+" "+u.getPassword());
			}
			
		} catch (JAXBException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
