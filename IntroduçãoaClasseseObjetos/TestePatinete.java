package IntroduçãoaClasseseObjetos;

public class TestePatinete {

	public static void main(String[] args) {
		
		
		//* Leticia Souza
		//* Data 09/09/21
		
		TestePatinete Patinete = new TestePatinete ();
		
		Patinete.setCor("Amarelo");
		Patinete.setIdadeIndc("Indicado de 6 á 11 anos");
		Patinete.setMarca("Skatenet");
		Patinete.setPreco(500);
		
		System.out.println("Cor do Patinete: " + Patinete.getCor());
		System.out.println("Indicação de idade: " + Patinete.getIdadeIndc());
		System.out.println("Marca do Patinete: " + Patinete.getMarca());
		System.out.println("Preço: " + Patinete.getPreco());
		

	}

}
