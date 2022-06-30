package projetojava1;
import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner( System.in );
		 
	      System.out.println( "Digite o lado do quadrado ");
	      double lado= scan.nextDouble();
	      
	   double area= Math.pow(lado, 2);
	      
	      System.out.println( area);
	      System.out.println( area*2);
		
		// TODO Auto-generated method stub

	}

}
