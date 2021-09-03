package VetoreseMatrizes;
import java.util.Scanner;
public class exercicio01VeM {

	//Ex01 Vetores e Matrizes//
	public static void main(String[] args) { 
    @SuppressWarnings("resource")
	Scanner leia = new Scanner(System.in);
    
		int vetor[] = new int [5];
		int maior = 0, n = 0;

		for(n = 0; n <= 4; n++) {
			
		System.out.println("Digite a pontuação: ");
	    vetor[n] = leia.nextInt();


		if (vetor[n] > maior) {
		maior = vetor[n];
		 }
		}

		System.out.println("O maior Ponto é: " + maior); 
		
		leia.close();
		
	}
}
