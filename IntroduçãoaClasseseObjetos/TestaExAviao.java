package IntroduçãoaClasseseObjetos;

public class TestaExAviao {

	public static void main(String[] args) {
		
		//* Leticia Souza
		//* Data 09/09/21
		
			ExAviao aviao01 = new ExAviao();
			
			aviao01.setModelo("modelo0101");
			aviao01.setFabricadora("fabricadoraTeste");
			aviao01.setAnoFabricacao(2021);

			System.out.println("Modelo: " + aviao01.getModelo());
			System.out.println("Fabricadora: " + aviao01.getFabricadora());
			System.out.println("Ano de fabricação: " + aviao01.getAnoFabricacao());
			
			
			
		
	}
	}


