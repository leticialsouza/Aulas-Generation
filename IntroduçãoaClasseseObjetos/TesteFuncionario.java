package IntroduçãoaClasseseObjetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//* Leticia Souza
	    //* Data 09/09/21
		
		TesteFuncionario Funcionario = new TesteFuncionario();
		
		Funcionario.setNome("Maria");
		Funcionario.setFuncao("Assistente de RH");
		Funcionario.setSalario("R$2,500");
		Funcionario.setTempoNaEmpresa("5 anos");
		
		System.out.println("Nome do funcionário: " + Funcionario.getNome());
		System.out.println("Sua função é: " + Funcionario.getFuncao());
		System.out.println("O seu salário é de: " + Funcionario.getSalario());
		System.out.println("Seu tempo na empresa é de: " + Funcionario.getTempoNaEmpresa());
		
		
	}

}
