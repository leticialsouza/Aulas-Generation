package IntroduçãoaClasseseObjetos;

public class TestePaciente {

	public static void main(String[] args) {
		
		//* Leticia Souza
		//* Data 09/09/21
		
		
		TestePaciente Paciente = new TestePaciente ();
		
		Paciente.setAltura("1,75");
		Paciente.setComorbidade("Diabética");
		Paciente.setIdade("45");
		Paciente.setNome("Maria");
		Paciente.setPeso("81kg");
		Paciente.codigopaciente("21832509");
		
		
		System.out.println("Altura do Paciente: " + Paciente.getAltura());
		System.out.println("Comorbidade do Paciente: " + Paciente.getComorbidade());
		System.out.println("Idade do Paciente: " + Paciente.getIdade());
		System.out.println("Nome do Paciente: " + Paciente.getNome());
		System.out.println("Peso do Paciente: " + Paciente.getPeso());
		System.out.println("Código do Paciente: " + Paciente.getCodigoPaciente());
		
		
		
	}

}
