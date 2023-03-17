package atividadesRepeticao;

import java.util.Scanner;

public class paresouimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int nump = 0, numi = 0;
		
		for (int x =1; x <= 10; x++) {
			System.out.println("\n Digite o " + x + " número: ");
			int numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				nump++;
				
			} else {
				numi++;
			
			}
		}
		
		System.out.println("\nNúmeros Pares: " + nump);
		System.out.println("\nNúmeros Impares: " + numi);
	}

}
