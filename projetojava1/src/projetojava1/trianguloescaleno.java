package projetojava1;
import java.util.Scanner;
public class trianguloescaleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite  o 1� numero ");
	     int a= scan.nextInt();
	      System.out.println( "Digite o 2�  numero ");
	      int b= scan.nextInt();
	      System.out.println( "Digite  o 3�  numero ");
	      int c= scan.nextInt();
	      
	      if(((a+b) > c )||( (a+c) > b) ||( (b+c) > a)) {
	         	  
	    	  
	     if(a ==b && a==c){
	    	  System.out.println( "Os 3 lados formam um Equilatero!");  
	    	  
	      } else if((a ==b) || (a==c )|| (b==c)){
	    	  System.out.println( "Os 3 lados formam um Isosceles!");  
	      }else if(a !=b && a!=c && b!=c){
	    	  System.out.println( "Os 3 lados formam um Escaleno!");
	      
	      }else
	    	  System.out.println( "N�o � triangulo!");
	}

	}
}
