package projetojava1;
import java.util.Scanner;

public class Femimasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		 Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite F OU M ");
	      String sexo= scan.next();
		
		
	      		if (sexo.equalsIgnoreCase("F") )  {
	    	  
	    	  
	    	  System.out.println("feminino");
	      }else if (sexo.equalsIgnoreCase("M") )  {
	    	  
	     
	    		System.out.println("masculino");
		
	      }else
	    	  
	    	  System.out.println("Sexo Inválido");
	}

}
