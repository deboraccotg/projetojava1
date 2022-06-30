package projetojava1;

import java.util.Scanner;

public class BIts {

	public static void main(String[] args) {
		//calcula o tempo de um dowloand em mb		
		
		double velbit,temp,tambit,vel1, veseg;
		int minpart, segparte;
		Scanner scan = new Scanner( System.in );
		
		System.out.println( "Digite o tamanho do arquivo em MB");
		double mb= scan.nextDouble();
		tambit=mb*8.388608;
		
		System.out.println( "Digite a velocidade do link");
		double vel=mb= scan.nextDouble();
		 velbit=vel/ 1000;
		 
		 vel1=tambit/velbit;
		 
		 temp=vel1 /60;
		 
		 minpart = (int)temp;
		 
		 veseg=vel1 %60;
		
		  segparte = (int)veseg;	
		 
	      System.out.println( "O tempo aproximado do Download é " + minpart +"  minutos e  "+ segparte + " Segundos");
	    
		
		
		
	}

}
