package Introdu��oaClasseseObjetos;

public class TestaCliente {
	public static void main(String[] args) {
	
	//Let�cia Souza
	//Data 08/09/21

	Cliente dado = new Cliente();
	
	
	dado.setNome("leticia");
	dado.setCpf("000.000.000-00");
	dado.setEmail("leticiatestecliente@gmail.com");
	dado.setEndereco("rua teste 85");
	dado.setIdade(24);

	System.out.println("Nome:" + dado.getNome());
	System.out.println("CPF: " + dado.getCpf());
	System.out.println("E-mail: " + dado.getEmail());
	System.out.println("Endere�o: " + dado.getEndereco());
	System.out.println("Idade: " + dado.getIdade());
	
}
}