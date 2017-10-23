package com.talllertwo.main;

import java.util.ArrayList;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonHelper {
	
	//https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.1
	
	public static Contact jsonToContact(String entrada){
		
		GsonBuilder builder = new GsonBuilder(); 
		Gson gson = builder.create(); 
		Type typeToken = new TypeToken<ArrayList<Contact>>(){}.getType();  
		ArrayList<Contact> list = gson.fromJson(entrada,typeToken); 
		
		return list.get(0);
	}
	
	public static String contactToJson(Contact entrada){
		GsonBuilder builder = new GsonBuilder(); 
		
		Type typeToken = new TypeToken<ArrayList<Contact>>(){}.getType();  
		Gson gson = builder.create(); 
		
		ArrayList<Contact> contactos=new ArrayList<>();
		contactos.add(entrada);
		
		String strList = gson.toJson(contactos, typeToken);
		
		return strList;
	}
	
	public static ArrayList<Contact>  jsonToArrayContact(String entrada){
		
		GsonBuilder builder = new GsonBuilder(); 
		Gson gson = builder.create(); 
		Type typeToken = new TypeToken<ArrayList<Contact>>(){}.getType();  
		ArrayList<Contact> list = gson.fromJson(entrada,typeToken); 
		return list;
	}
	
	public static String contactToJson(ArrayList<Contact> entrada){	
		GsonBuilder builder = new GsonBuilder(); 
		Type typeToken = new TypeToken<ArrayList<Contact>>(){}.getType();  
		Gson gson = builder.create(); 
		String strList = gson.toJson(entrada, typeToken);	
		return strList;
	}
	
	
	
}
