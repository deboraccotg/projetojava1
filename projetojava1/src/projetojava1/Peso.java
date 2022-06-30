package projetojava1;

import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner( System.in );
		 
	      System.out.println( "Digite a altura ");
	      double alt= scan.nextDouble();
		double peso=( 72.7 * alt ) - 58;
		
		
		 
	      System.out.println( peso);
	     
		
		

	}

}
