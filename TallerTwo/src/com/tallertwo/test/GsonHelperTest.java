package com.tallertwo.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.talllertwo.main.Contact;
import com.talllertwo.main.GsonHelper;

public class GsonHelperTest {
	
	@Test
	public void contactToJsonTest(){
		Contact contact=new Contact("pepe","938129442","paco@gmail.com");
		String salida=GsonHelper.contactToJson(contact);
		
		Contact result  = GsonHelper.jsonToContact(salida); 
		
		Assert.assertEquals(contact.getName(), result.getName());
		Assert.assertEquals(contact.getPhone(), result.getPhone());
		Assert.assertEquals(contact.getEmail(), result.getEmail());
		
		
	}
	
	@Test
	public void contactToJsonTest2(){
		/*String contactos="[{'name':'pepe','phone':'938129442','email':'paco@gmail.com'}"
				+ ",{'name':'pakito','phone':'908129442','email':'asd@gmail.com'}]";*/
		
		ArrayList<Contact> lContactos=new ArrayList<>();
		
		Contact cont=new Contact("pepe","938129442","paco@gmail.com");
		lContactos.add(cont);
		
		cont=new Contact("pakito","908129442","asd@gmail.com");
		lContactos.add(cont);
		
		String result= GsonHelper.contactToJson(lContactos); 
		
		ArrayList<Contact> lContactos2=new ArrayList<>();
		lContactos2=GsonHelper.jsonToArrayContact(result);
		
		Assert.assertEquals(lContactos.size(),lContactos2.size());
		
		for(int i=0;i<lContactos.size() && i<lContactos2.size(); i++){
			Assert.assertEquals(lContactos.get(i).getName(),lContactos2.get(i).getName());
			Assert.assertEquals(lContactos.get(i).getEmail(),lContactos2.get(i).getEmail());
			Assert.assertEquals(lContactos.get(i).getPhone(),lContactos2.get(i).getPhone());
		}
		
		
		
	}
}
