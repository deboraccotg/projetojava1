package projetojava1;
import java.util.Scanner;
public class Nomemaiorque3carat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		String  nome,sexo,estado;
		double salario;
		int idade;
		boolean informacaovalid=false;
		do {
		System.out.println( "Digite um nome ");
		nome = scan.next();
		
		if(nome.length()>=3) {
			informacaovalid=true;
					
		}else {
			
			System.out.println( "Nome digitado não possui mais de 3 caracteres  ");
			
		}
		
		
		}while(!informacaovalid);
		
		boolean salariovalid=false;
		do {
	
		System.out.println( "Digite o salario ");
		salario = scan.nextDouble();
		if(salario >0) {
			salariovalid=true;
			
			}else {
			
			System.out.println( "Nome digitado não possui mais de 3 caracteres  ");	
		}
		
		}while(!salariovalid);
		
		boolean idadeovalid=false;
		do {
	
		System.out.println( "Digite a sua idade  ");
		idade = scan.nextInt();
		if( idade >0 && idade<=150) {
			idadeovalid=true;
			
			}else {
			
			System.out.println( "idade inválida ");	
		}
		
		}while(!idadeovalid);
		
		boolean sexvalid=false;
		do {
		System.out.println( "Digite estado civil c,d,v,s");
		sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("c") || sexo.equalsIgnoreCase("s" )|| sexo.equalsIgnoreCase("v" )|| sexo.equalsIgnoreCase("d" ))  {
	    	   
	    		   sexvalid=true;
					
		}else {
			
			System.out.println( "Estado civil Inválido  ");
			
		}
		
		
		}while(!sexvalid);
		
		
		
		boolean estvalid=false;
		do {
		System.out.println( "Digite o sexo F OU M ");
		estado = scan.next();
		
		if (estado.equalsIgnoreCase("F") || estado.equalsIgnoreCase("M" ))  {
	    	   
			estvalid=true;
					
		}else {
			
			System.out.println( "Sexo Inválido  ");
			
		}
		
		
		}while(!estvalid);
	}

}
