package exerciciosJava;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
			   
			   Scanner leia=new Scanner(System.in);
			   
			   int N1=0, N2=0, N3=0;
			   
			   System.out.println("Escreva o primeiro número: ");
			   N1 = leia.nextInt();
			   
			   System.out.println("Escreva o segundo número: ");
			   N2 = leia.nextInt();
			   
			   System.out.println("Escreva o terceiro número: ");
			   N3 = leia.nextInt();
			   
			   if (N1 > N2 && N1 > N3) {
			   System.out.println("O primeiro número é maior");
		       }
			   if (N1 > N2 && N1 > N3) {
			   System.out.println("O segundo número é maior");
	           }
			   if (N3 > N1 && N3 > N2) {
			   System.out.println("O terceiro número é maior");
			   }
			  
			   leia.close();
			   
			 
		   }


	}

