package exerciciosJava;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
			   
			   Scanner leia=new Scanner(System.in);
			   
			   int N1=0, N2=0, N3=0;
			   
			   System.out.println("Escreva o primeiro n�mero: ");
			   N1 = leia.nextInt();
			   
			   System.out.println("Escreva o segundo n�mero: ");
			   N2 = leia.nextInt();
			   
			   System.out.println("Escreva o terceiro n�mero: ");
			   N3 = leia.nextInt();
			   
			   if (N1 > N2 && N1 > N3) {
			   System.out.println("O primeiro n�mero � maior");
		       }
			   if (N1 > N2 && N1 > N3) {
			   System.out.println("O segundo n�mero � maior");
	           }
			   if (N3 > N1 && N3 > N2) {
			   System.out.println("O terceiro n�mero � maior");
			   }
			  
			   leia.close();
			   
			 
		   }


	}

