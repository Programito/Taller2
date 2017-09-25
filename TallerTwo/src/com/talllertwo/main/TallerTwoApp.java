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
		
		String str=ConversorStrInt.convertirStr(123);
		System.out.println(str);
		 
	 }

}
