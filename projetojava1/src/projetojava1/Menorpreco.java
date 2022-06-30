package projetojava1;
import java.util.Scanner;
public class Menorpreco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite o valor do 1ºitem ");
	     double item1= scan.nextDouble();
	      System.out.println( "Digite o valor do 2ºitem ");
	      double item2= scan.nextDouble();
	      System.out.println( "Digite o valor do 3ºitem ");
	      double item3= scan.nextDouble();
	      
	      
	      if (item1<=item2 || item1<=item3) {
	    	  System.out.println( item1);
	    	  
	      }else if (item2 <= item3 ) {
	    	  System.out.println( item2);
	    	  
	      }else
	    	  System.out.println( item3);
	   

	}

}
