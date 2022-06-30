package projetojava1;

import java.util.Scanner;

public class Horastrab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  total;
		
		Scanner scan = new Scanner( System.in );
		 
	      System.out.println( "Digite as horas trabalhadas ");
	      double hora= scan.nextDouble();
	     
			 
	      System.out.println( "Digite o valor da hora  ");
	      double valor= scan.nextDouble();
	      
	      total= hora*valor;
	  
			 
	      System.out.println( total);
	     

	}

}
