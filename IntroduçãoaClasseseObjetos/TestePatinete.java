package Introdu��oaClasseseObjetos;

public class TestePatinete {

	public static void main(String[] args) {
		
		
		//* Leticia Souza
		//* Data 09/09/21
		
		TestePatinete Patinete = new TestePatinete ();
		
		Patinete.setCor("Amarelo");
		Patinete.setIdadeIndc("Indicado de 6 � 11 anos");
		Patinete.setMarca("Skatenet");
		Patinete.setPreco(500);
		
		System.out.println("Cor do Patinete: " + Patinete.getCor());
		System.out.println("Indica��o de idade: " + Patinete.getIdadeIndc());
		System.out.println("Marca do Patinete: " + Patinete.getMarca());
		System.out.println("Pre�o: " + Patinete.getPreco());
		

	}

}
