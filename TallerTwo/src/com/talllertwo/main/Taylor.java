package com.talllertwo.main;

public class Taylor {

	public static float exp(float x, int n){
		float expo=1;
		if(x>0){
			float y=x;
			expo=1;
			int factorial=1;
			for(int i=1;i<n;i++){
				expo=expo +  (y / factorial);
				y=y*x;
				factorial=factorial*(i+1);
				
			}
		}
		return expo;
	}
	
	public static float sen(float x,int n){
		float num=1; 
		float fact=1;
		float seno= 0;
		int signo=1;
		
		for(int i=1;i<n*2;i++){
			
			fact= fact*i;
			num=num*x;
			
			if((i%2)!=0){
				//System.out.println("Factorial " + i + ": " + fact);
				//System.out.println("num: " +num);
				seno=seno + signo* num/fact;
				signo=signo * -1;
			}		
		}
		
		
		return seno;
	}
	
	

	public static float cos(float x,int n){
		float cose=1;
		float num=1; 
		float fact=1;
		int signo=1;
		
		for(int i=1;i<n*2;i++){
			
			fact= fact*i;
			num=num*x;
			
			if(i>1 && (i%2)==0){
				//System.out.println("Factorial " + i + ": " + fact);
				//System.out.println("num: " +num);
				cose=cose - signo* num/fact;
				signo=signo * -1;
			}		
		}
		
		
		return cose;
	}
	
	
	
	
}