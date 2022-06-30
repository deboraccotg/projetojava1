package projetojava1;
import java.util.Scanner;

public class Notas0a10 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner( System.in );
		
		boolean  numerovalid=false;
		
		do {
	      System.out.println( "Digite  uma nota  que esteja entre 0 e 10");
	      int num= scan.nextInt();
	      
	      if (num >=0 && num <=10 ) {
	    	  
	    	  numerovalid=true;
	    	  
	    	  System.out.println( "Você digitou "+ num);
	    	  
	    	  
	      }else {
	    	  
	    	  System.out.println( "número invalido");
	      
	      
	      }
	      

		
		
		}while (!numerovalid);
		
	}

}
