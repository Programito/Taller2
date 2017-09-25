package com.talllertwo.main;

public class ConversorStrInt {
	static final String[] cadenaNumeros={"zero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	public static int convertirInt (String entrada){
		int resultado=0;
		String numero="";
		for(int i=0;i<entrada.length();i++){
			if(entrada.charAt(i)==' '){
				resultado=addResultado(numero,resultado);
				numero="";
				
			}
			else{
				numero=numero+entrada.charAt(i);
			}
		}
		
		resultado=addResultado(numero,resultado);
		return resultado;
	}
	
	public static String convertirStr(int valor){
		String resultado="";
		while(valor>0){
			int pos=valor%10;
			resultado=cadenaNumeros[pos]+','+resultado;
			valor=valor/10;
		}
		if(resultado.length()>0){
			resultado=resultado.substring(0, resultado.length()-1); 
		}
		return resultado;
	}
	
	private static int addResultado(String numero, int resultado){
		boolean buscar=true;
		for(int j=0;j<cadenaNumeros.length && buscar;j++){
			if(numero.equals(cadenaNumeros[j])){
				resultado=resultado*10+ j;
				buscar=false;
			}
		}
		return resultado;
	}
}
