package projetojava1;
import java.util.Scanner;

public class notaabcde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  A 1º nota ");
	     int nota1= scan.nextInt();
	      System.out.println( "Digite  A 2º nota");
	      int nota2= scan.nextInt();
	      double media= (nota1+nota2)/2;
	      
	      String aproveitamento="";
	      if ( media ==9.0 || media ==10.0 )  {
	    	  aproveitamento= "A";
	    	  
	      }else if ( media >=7.5 || media >=9.0 )  {
	    	  aproveitamento= "B";
	    	  
	      }else if ( media >=6.0 || media >=7.5 )  {
	    	  aproveitamento= "C";
	    	  
	      }else if ( media >=4.0 || media >=6.0 )  {
	    	  aproveitamento= "D";
	    	  
	      }else if ( media >=0.0 || media < 4.0 )  {
	    	  aproveitamento= "E";
	    	  
	      
		
	}
	      System.out.println("nota 1 "+nota1);
	      System.out.println("nota 2 "+nota2);
	      System.out.println("media "+media);
	      System.out.println("Conceito "+aproveitamento);
	
	switch (aproveitamento) {
	case "A":
	case "B":
	case "C":System.out.println(" Aprovado");break;
		
		
	case "D":
	case "E":System.out.println(" Reprovado");break;
	
	
	
	
	}
	}
}
