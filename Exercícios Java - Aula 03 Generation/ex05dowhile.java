package exercicioJavaAula03;
import java.util.Scanner;
public class ex05dowhile {

	public static void main(String[] args) {
		
		int num1 = 0, soma = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite ( 0 ) para concluir o loop");
		
		do {
			
			System.out.println("Digite um número: ");
		    num1 = scan.nextInt();
		    soma+=num1;
		    
		}
		while(num1 != 0);
		scan.close();
		
		System.out.println("A soma dos números é: " + soma);
			
	}
		

	}


