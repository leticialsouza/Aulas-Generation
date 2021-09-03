package VetoreseMatrizes;
import java.util.Scanner;
public class ex02VeM {

	//Ex02 Vetores e Matrizes//
	public static void main(String[] args) {
		
		int bids[] = new int [5], more = 0, qty = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lance o dado");
		
		int mean = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "\narremesse: ");
			bids[i] = scan.nextInt();
			
			mean += bids[i];
			
			if(bids[i] > more) {
				more = bids[i];
				qty = 0;
			}
			if(bids[i] == more) {
			}	
				
			}
		scan.close();
		System.out.print("Maior lance:" + more + "," + qty + "." + "\nDiga: " + (mean / 5));
	}

}
