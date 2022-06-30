package projetojava1;
import java.util.Scanner;

public class Metroemcentrimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double   cent;
		
		 Scanner scan = new Scanner( System.in );
	      System.out.println( "Digite os metros: ");
		  double metro = scan.nextDouble();
		  cent = metro*100;
		  
		  System.out.println( cent );

	}

}
