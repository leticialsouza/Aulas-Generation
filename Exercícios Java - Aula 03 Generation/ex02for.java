package exercicioJavaAula03;
import java.util.Scanner;

public class ex02for {
	
	 public static void main(String[] args) {
	 Scanner leia=new Scanner(System.in);
		 
     int cont, num, contPar = 0, contImpar = 0;
     
    	 for(cont=0;cont<=9;cont++) {
    	System.out.println("Digite 01 número: "); 
		num = leia.nextInt();	 
    	
		if(num % 2 == 0) {
    		 contPar++;
    	 }	
    	 
    	else {
    		 contImpar++; 
    	}
    	 
    	
    	 
    	 }
    	 System.out.println(contPar + " São pares e " +contImpar+ " são impares");
     	
     	 leia.close(); 
     }
		
		 
		 
		 

	}


