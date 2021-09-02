package exerciciosJava;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Escreva o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Escreva o segundo numero: ");
		num2 = ler.nextInt();
		System.out.println("Escreva o terceiro numero: ");
		num3 = ler.nextInt();
		
		
		if (num1<num2 && num1<num3) {
			System.out.println("\n-"+num1); 
			if (num2<num3) {
				System.out.println("\n-"+num2);
			    System.out.println("\n-"+num3);
			}
			else {
				System.out.println("\n-"+num3);
			    System.out.println("\n-"+num2);
			}
		}
			    
			
		if (num2<num1 && num2<num3) {
				System.out.println("\n-"+num2);
				if (num1<num3) {
					System.out.println("\n-"+num1);
				    System.out.println("\n-"+num3);
				}
				else {
					System.out.println("\n-"+num3);
				    System.out.println("\n-"+num1);
				}
		}
		
		if (num3<num1 && num3<num2) {
				    System.out.println("\n-"+num3);
					if (num1<num2) {
							System.out.println("\n-"+num1);
					        System.out.println("\n-"+num2);
					}
						else {
							System.out.println("\n-"+num2);
					        System.out.println("\n-"+num1);
						}
		}
		
	}


		
	}
