package projetojava1;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner( System.in );
		
		boolean  informacaovalid=false;
		
		do {
	      System.out.println( "Digite o seu nome de usúario");
	      
	      String nomeusuario= scan.next();
	      
	      System.out.println( "Digite a senha ");
	      
	      String senha= scan.next();
	      
	      if ( nomeusuario.equalsIgnoreCase(senha)  ) {
	    	  
	    	  informacaovalid=false;
	    	  
	    	  System.out.println( "senha igual a usuario digite novamente ");
	    	  
	    	  
	      }else {
	    	  informacaovalid=true;
	    	  
	    	  System.out.println( "senha e usuario validos ");
	      
	      
	      }
	      

		
		
		}while (!informacaovalid);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
