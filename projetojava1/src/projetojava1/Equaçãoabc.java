package projetojava1;

import java.util.Scanner;

public class Equaçãoabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  a ");
	      int a= scan.nextInt();
	      
	      if ( a ==0 )  {
	    	  
	    	  System.out.println( "valor invalido");  
	    	  
	      }else {
	    	  
	    	  System.out.println( "Digite  b");
		      int b= scan.nextInt();
		      System.out.println( "Digite c ");
		      int c= scan.nextInt();
	    	  
	    	  double delta= (b * b) - (4 * a *c) ;
	    	  
	    	  if (delta < 0) {
	    		  
	    		  System.out.println( "delta negativo");  
	    		  
	    	  } else {

	                System.out.println("delta: " + delta);

	                double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
	                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

	                System.out.println("x1 = " + x1);
	                System.out.println("x2 = " + x2);
	            }
	      }
		
		
		
		
		

	}

}
