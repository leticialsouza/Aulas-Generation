package collection;

public class CollectionsEx03 {

	public static void main(String[] args) {
		//Let�cia Souza 
		//Data 14.09.21
		
		String dpt1 = "Quant de camisetas: 500";
    	String dpt2 = "Quant de cal�as: 400";
    	String dpt3 = "Quant de shots: 300";
    	String dpt4 = "Quant de meia-cal�a: 250";

    	ArrayList<String> Estoque = new ArrayList<>();
    	Estoque.add(dpt1);
    	Estoque.add(dpt2);
    	Estoque.add(dpt3);
    	Estoque.add(dpt4);

    	System.out.println("O estoque da loja" +Estoque);
    
    
    	System.out.println("Estoque");
    	Estoque.remove(2);
    	System.out.println("O estoque da loja foi atualizado" + Estoque); 

	}

}
