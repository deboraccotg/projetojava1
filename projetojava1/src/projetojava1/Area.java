package projetojava1;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite o raio do circulo ");
	      double raio= scan.nextDouble();
	      
	     double  area= Math.PI * Math.pow(raio, 2);
	      
	      System.out.println( area);
		

	}

}
