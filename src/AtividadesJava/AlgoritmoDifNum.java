package AtividadesJava;

import java.util.Scanner;

public class AlgoritmoDifNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de N1: ");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite o valor de N2: ");
		float n2 = leia.nextFloat();
		
		System.out.println("Digite o valor de N3: ");
		float n3 = leia.nextFloat();
		
		System.out.println("Digite o valor de N4: ");
		float n4 = leia.nextFloat();
		
		float resultado = (n1 * n2) - (n3 * n4);
		
		System.out.println("Resultado: " + resultado);
		
	}

}
