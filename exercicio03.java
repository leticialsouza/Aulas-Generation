package exerciciosJava;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade= leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
		System.out.println("Você esta na categoria Infantil ");
		}
		if (idade >= 15 && idade <= 17) {
	    System.out.println("Você esta na categoria Juvenil "); 
		}
		else if (idade >= 18 && idade <= 25){
		System.out.println("Você esta na categoria Adulto ");	
		}
        
	leia.close();
		
	}
	}

