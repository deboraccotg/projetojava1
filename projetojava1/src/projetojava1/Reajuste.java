package projetojava1;
import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  o salario");
	      double salario= scan.nextDouble();
		
		
	      		if ( salario<250 )  {
	      			double aum= (salario*20)/100;
	      			double novo= aum+salario;
	    	  
	    	  
	    	  System.out.println("o aumento foi 20% "+ aum+ " de : " + salario+ " salario com aumento "+novo);
	    	  
	      }else if ( salario >=250 && salario <=700 )  {
    			double aum= (salario*15)/100;
    			double novo= aum+salario;
  	    	  
  	    	  
  	  System.out.println("o aumento foi  15% "+ aum+ " de : " + salario+" salario com aumento "+novo);
  	  
	      }else if ( salario >=750 && salario <=1500 )  {
    			double aum= (salario*10)/100;
    			double novo= aum+salario;
  	    	  
  	    	  
  	  System.out.println("o aumento foi de 10%  "+ aum+ " de : " + salario+ " salario com aumento "+novo);
	    	  
	 	     
	      }else if ( salario > 1500  )  {
  			double aum= (salario*5)/100;
  			double novo= aum+salario;
	    	  
	    	  
	  System.out.println("o aumento foi  5% "+ aum+ " de : " + salario+" salario com aumento "+novo);
	}
		

}
}
