package exercicioJavaAula03;
import java.util.Scanner;

public class ex04whilejava {

	public static void main(String[] args) {

				int contPessoa = 0, contPessoaCalma = 0, contMulherNervosa = 0, contHomemAgressivo = 0, contOutroCalmo = 0, contNervoso40 = 0,
				contCalmo18 = 0, idade = 0, genero = 0, estado = 0;		

				Scanner scan = new Scanner(System.in);
				
				do {
					System.out.println("Digite seu gênero 1 = Masculino | 2 = Feminino | 3 = Outro ");
					genero = scan.nextInt();
					System.out.println("Digite sua idade: ");
					idade = scan.nextInt();
					scan.nextLine();

					if(genero == 1) {
						System.out.println("Digite se você é: 1 = Calmo | 2 = Agressivo");
						estado = scan.nextInt();
						scan.nextLine();
						if(estado == 1) {
							contPessoaCalma++;
							if(idade < 18)
								contCalmo18++;
						} else if(estado == 2) {
							contHomemAgressivo++;
							if(idade > 40)
								contNervoso40++;
						}
						contPessoa++;
					}
					if(genero == 2) {
						System.out.println("Digite se você é: 1 = Calma | 2 = Nervosa");
						estado = scan.nextInt();
						if(estado == 1) {
							contPessoaCalma++;
							if(idade < 18)
								contCalmo18++;
						} else if (estado == 2) {
							contMulherNervosa++;
							if(idade > 40)
								contNervoso40++;
						}
						contPessoa++;
					}
					if(genero == 3) {
						System.out.println("Digite se você é uma pessoa: 1 = Calma | 2 = Nervosa");
						estado = scan.nextInt();
						if(estado == 1) {
							contPessoaCalma++;
							contOutroCalmo++;
							if(idade < 18)
								contCalmo18++;
						}
						if(estado == 2)
							if(idade>40)
								contNervoso40++;
						contPessoa++;
					}
					if(genero != 1 && genero !=2 && genero != 3)
						System.out.println("Entrada invalida");
				}while(contPessoa != 150); //Trocar a número para fazer testes

				scan.close();

				System.out.println("Número de homens agressivos: " + contHomemAgressivo +
				"Número de mulheres nervosas: " + contMulherNervosa +
				"Número de pessoas calmas: " + contPessoaCalma +
				"Número de outros calmos: " + contOutroCalmo +
				"Número de pessoas nervosas com mais de 40 anos: " + contNervoso40 +
				"Número de pessoas calmas menor que 18 anos: " + contCalmo18);
			

	}

}
