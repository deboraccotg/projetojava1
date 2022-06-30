package projetojava1;

import java.util.Scanner;

public class Calculo2intereal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			Scanner scan = new Scanner( System.in );
		 
			System.out.println( "Digite o 1º número ");
			int a= scan.nextInt();
			System.out.println( "Digite o 2º número ");
			int b= scan.nextInt();
			System.out.println( "Digite um número real ");			
		    double c= scan.nextDouble();
		    
			int resul1=(a*2)*(b/2);
			double resul2=(a*3) + c;
			double resul3=Math.pow(c,3);
			
			
			System.out.println( "resultado 1: " +resul1 );
			System.out.println( "resultado 2: " +resul2);
			System.out.println( "resultado 3: " +resul3 );
	}

}
