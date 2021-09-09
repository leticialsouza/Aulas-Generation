package IntroduçãoaClasseseObjetos;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		//* Leticia Souza
	    //* Data 09/09/21
		
		TesteContaBancaria ContaBancaria = new TesteContaBancaria();
		
		ContaBancaria.setNome("Maria Mariazinha");
		ContaBancaria.setAgencia("0530");
		ContaBancaria.setContaCorrente("1064571-3");
		ContaBancaria.setSaldo("R$1,800");

		System.out.println("Nome Completo: " + ContaBancaria.getNome());
		System.out.println("Agência: " + ContaBancaria.getAgencia());
		System.out.println("Conta Corrente: " + ContaBancaria.getContaCorrente());
		System.out.println("Saldo em conta: " + ContaBancaria.getSaldo());

		
	}

}
