package exerciciosJava;

import java.util.Scanner;

public class xercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero;
		double raiz, elevado;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		if(numero % 2 ==0) {; 
		   System.out.println("este numero é par...");
		   raiz = Math.sqrt(numero);
		   
		   System.out.println("Raiz Quadrada:" + raiz);
		   System.out.println("Raiz Quadrada:" + Math.sqrt(numero));
		}
		else if (numero % 2==1) { 
			System.out.println("este numero é impar...");
			elevado = Math.pow(numero, 2);
			
			System.out.println("potencia:  + elevado");
			
			leia.close();
		}
		}



	}


