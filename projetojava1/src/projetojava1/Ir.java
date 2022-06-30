package projetojava1;

import java.util.Scanner;

public class Ir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  as horas trabalhadas ");
	      double horas= scan.nextDouble();
	      System.out.println( "Digite  o valor da hora trabalhada ");
	      double valorhora= scan.nextDouble();
	      
		
		 double salario=valorhora* horas;
		 
		 int percentualir=0;
		 
	      		if ( salario <=900 )  {	      			
	    	  
	      			percentualir=0;
	    	  
	      }else if ( salario >900 && salario <= 1500)  {
	    	  percentualir=5;
    	  
	  
	      }else if ( salario >1500 && salario <= 2500)  {
	    	   
	    	  percentualir=10;
	 	     
	      }else if (  salario > 2500)  {
	    	  
	    	  
	    	  percentualir=20;    	  
	    	  
	    	   }
	    	    double ir = (salario / 100)* percentualir;	    	    
	    	    double inss= (salario / 100)* 10;		    	    
    			double fgts= (salario / 100)* 11;    			
    			double desc = inss + ir;    			
    			double liq = salario - desc;
    			
  	  
    			System.out.println( "salario Bruto (: " + horas+ " * " +valorhora+" ): "+ salario);
    			
    			System.out.println("(-) IR ( " + percentualir + " % ):  "+ ir);
    			System.out.println("(-) INSS ( 10 %):  "+ inss);
    			System.out.println("FGTS ( 11 %):  "+fgts);
    			System.out.println("Total de descontos:  "+desc);
    			System.out.println("Salario Liquido:  "+liq);
    							
	}

}
