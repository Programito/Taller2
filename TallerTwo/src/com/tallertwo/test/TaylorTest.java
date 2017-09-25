package com.tallertwo.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.talllertwo.main.ConversorStrInt;
import com.talllertwo.main.SuperWord;
import com.talllertwo.main.Taylor;

public class TaylorTest {

	@Test
	public void expTest(){
		float exp=Taylor.exp(3,9);
		Assert.assertEquals(20.0855369232, exp,0.1);
	}
	
	@Test
	public void senTest(){
		float sen=Taylor.sen(2,19);
		//Assert.assertEquals(0.9333,sen,0.1);
		Assert.assertEquals(0.909,sen,0.1);
		
	}
	
	@Test
	public void cosTest(){
		float cos=Taylor.cos(1,19);
		float real=0;
		Assert.assertEquals(0.54, cos,0.1);
	}
	
	
	@Test
	public void reflectTest(){
		String result="ALOH";
		SuperWord sw= new SuperWord("HOLA");
		String refl= sw.reflect();
		Assert.assertEquals(result,refl);
	}
	
	
	@Test
	public void  numberVocalTest(){
		SuperWord.Vocal[] result= new SuperWord.Vocal[2];
		result[0]=new SuperWord.Vocal('a',2);
		result[1]=new SuperWord.Vocal('o',1);
		
		SuperWord sw= new SuperWord("holaA");
		ArrayList<SuperWord.Vocal> lVocal= sw.numberVocal();
		//SuperWord.Vocal[] aVocal= new SuperWord.Vocal[lVocal.size()];
		//lVocal.toArray(aVocal);
		//Assert.assertArrayEquals(result, aVocal);
		Assert.assertEquals(result[0].getC(), lVocal.get(0).getC());
		Assert.assertEquals(result[0].getNumber(), lVocal.get(0).getNumber());
		Assert.assertEquals(result[1].getC(), lVocal.get(1).getC());
		Assert.assertEquals(result[1].getNumber(), lVocal.get(1).getNumber());
	}
	
	
	
	@Test
	public void isPalindromTest(){
		boolean result=true;
		SuperWord sw= new SuperWord("Anita lava la tina");
		boolean calculat=sw.isPalindrom();
		Assert.assertEquals(result, calculat);
		
	}
	
	
	@Test
	public void ConversorStrIntTest(){
		int resultado=123;
		int calculado=ConversorStrInt.convertirInt("uno dos tres");
		Assert.assertEquals(resultado, calculado);
		
	}
	
	
	@Test
	public void  convertirStrTest(){
		String resultado="dos,tres,cinco";
		String calculado=ConversorStrInt. convertirStr(235);
		Assert.assertEquals(resultado, calculado);
		
	}
}
