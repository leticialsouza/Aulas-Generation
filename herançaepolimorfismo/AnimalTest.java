package heran�aepolimorfismo;

public class AnimalTest {
	
//Let�cia Souza
//Data 09.09.21
	
	public static void main(String[] args) {

		
		Cachorro Doguinho = new Cachorro();
		Cavalo Horse = new Cavalo();
		Pregui�a Sloth = new Pregui�a();
		
		
		Doguinho.setIdade("5");
		Doguinho.setNome("Zequinha");
		System.out.println(Doguinho.Corre());
		
		System.out.println("A idade do Doguinho: " + Doguinho.getIdade());
		System.out.println("O nome do Doguinho: " + Doguinho.getNome());
		
		
		
		Horse.setIdade("10");
		Horse.setNome("Bojack");
		Horse.Corre();
		
		System.out.println("A idade do Cavalo: " + Horse.getIdade());
		System.out.println("O nome do Cavalo: " + Horse.getNome());
		
		
		Sloth.setIdade("50");
		Sloth.setNome("Preguicinha");
		Sloth.Subir();
			
		System.out.println("A idade da Pregui�a: " + Sloth.getIdade());	
		System.out.println("O nome da Pregui�a: " + Sloth.getNome());	
			
		

	}	

	}

