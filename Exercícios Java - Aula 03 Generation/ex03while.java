package exercicioJavaAula03;
import java.util.Scanner;
public class ex03while {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade = 0, cont50=0, cont21=-1;
		
		while(idade<=99) {
			System.out.println("Digite sua idade: ");
			idade=in.nextInt();
			
			if (idade < 21) {
				cont21++;
			}
			
			else if(idade > 50) {
				cont50++;
			}
		}
        System.out.printf("\nTemos % de pessoas com mais de 50 anos", cont50);
		System.out.printf("\nTemos % de pessoas com menos de 21 anos", cont21);
		
		in.close();
		
    }
}
