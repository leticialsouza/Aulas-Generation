package exercicioJavaAula03;
import java.util.Scanner;
public class ex06dowhile {

	public static void main(String[] args) {
		int num1 = 0, soma = 0, cont = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite ( 0 ) para encerrar o loop");
		do {
			System.out.println("Digite um número: ");
			num1 = scan.nextInt();
			if(num1%3 == 0) {
				soma+=num1;
				cont++;
			}
		}while(num1 != 0);
		scan.close();
		System.out.println("A média = " + (soma/cont));
	}


	}


