package com.talllertwo.main;

import java.util.ArrayList;

public class TallerTwoApp {
	 public static void main(String[] args) {
		 //Para entrar en una clase interna
		 //SuperWord.Vocal vocal = new SuperWord.Vocal('a',2);
		 
		 /*SuperWord sw= new SuperWord("pepe pere pepito");
		 String ref= sw.reflect();
		 System.out.println(ref);
		 ArrayList<SuperWord.Vocal> list = sw.numberVocal();
		for(int i=0;i<list.size();i++){
			SuperWord.Vocal vocal=list.get(i);
			System.out.println(vocal.getC() + ": " + vocal.getNumber() + "\n");
		}*/
		 
		/*float seno=Taylor.sen(2, 10);
		System.out.println(seno);*/
		
		/*int i=ConversorStrInt.convertirInt("tres uno cuatro");
		System.out.println(i);*/
		
		//String str=ConversorStrInt.convertirStr(123);
		//System.out.println(str);
		 
		/*Contact contact=new Contact("pepe","938129442","paco@gmail.com");
		String salida=GsonHelper.contactToJson(contact);
		System.out.println(salida);
		
		String salida2="[{'name':'pepe','phone':'938129442','email':'paco@gmail.com'}]";
		Contact contact2= GsonHelper.jsonToContact(salida2);
		System.out.println(contact2.getName());
		System.out.println(contact2.getPhone());
		System.out.println(contact2.getEmail());
		
		
		String s1= "[{'name':'pepe','phone':'938129442','email':'paco@gmail.com'}]"
		+ "[{'name':'juan','phone':'908129442','email':'pepe@gmail.com'}]";
		
		ArrayList<Contact> contactos=new ArrayList<>();
		contactos= GsonHelper.jsonToArrayContact(s1);
		for(int i=0;i<contactos.size();i++){
			System.out.println(contactos.get(i).getName());
			System.out.println(contactos.get(i).getPhone());
			System.out.println(contactos.get(i).getEmail());
			System.out.println("");
		}*/
		 
		 
		ArrayList<Contact> lContactos=new ArrayList<>();
		Contact cont=new Contact("pepe","938129442","paco@gmail.com");
		lContactos.add(cont);
		cont=new Contact("pakito","938129442","paco@gmail.com");
		lContactos.add(cont);
			
		String result= GsonHelper.contactToJson(lContactos); 
		System.out.println(result);
	 }

}
