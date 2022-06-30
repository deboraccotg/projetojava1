package projetojava1;

import java.util.Scanner;

public class Horasmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner scan = new Scanner( System.in );
		 
	      System.out.println( "Digite as horas trabalhadas ");
	      double hora= scan.nextDouble();
	     
			 
	      System.out.println( "Digite o valor da hora  ");
	      double valor= scan.nextDouble();
	      
	      double salariobruto= hora*valor;
	     double inss=(salariobruto/100)*8;
	     double ir=(salariobruto/100)*11;
	      double sindicato=(salariobruto/100)*5;
	      double desconto = inss+ir+sindicato;
	      double salarioliq= salariobruto - desconto;
	      
			 
		 
		
		      System.out.println("salario bruto é: " + salariobruto+  
		    		  "\ninss é: "+ inss+
		    		  "\nir é: "+ ir+
		    		  "\nsindicato é: "+sindicato+
		    		  "\nsalarioliq é: "+ salarioliq);

	}

}
