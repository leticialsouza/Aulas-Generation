package IntroduçãoaClasseseObjetos;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		//* Leticia Souza
		//* Data 09/09/21
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		produto.setProduto("celular");
		produto.setMarca("Huawei");
		produto.setSistemaOperacional("Android");
		
		System.out.println("O Produto é: " + produto.getProduto());
		System.out.println("A marca é: " + produto.getMarca());
		System.out.println("O sitema operacional é: " + produto.getSistemaOperacional());
	}

}
