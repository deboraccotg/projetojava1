package projetojava1;

import java.util.Scanner;

public class Bomdia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  M- Matutino V-Vespertino N-noturno ");
	      String periodo= scan.next();
		
		
	      		if (periodo.equalsIgnoreCase("m") )  {
	    	  
	    	  
	    	  System.out.println("Bom dia");
	    	  
	      }else if (periodo.equalsIgnoreCase("v") )  {
	    	  
	     
	    		System.out.println("Boa Tarde");
	    		
	      }else if (periodo.equalsIgnoreCase("n") )  {
	    	  
	 	     
	    		System.out.println("Boa Noite");
		
	      }else
	    	  
	    	  System.out.println(" Inválido");
	}


	}


