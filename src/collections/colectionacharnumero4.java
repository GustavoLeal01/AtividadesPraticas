package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class colectionacharnumero4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
				
		Set<Integer> numeros = new HashSet<Integer>();
		
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontar: ");
		int n = leia.nextInt();
		
		boolean verifica;
		
		verifica = numeros.contains(n);
		
		if(verifica == true) {
			System.out.printf("O número %d foi encontrado!! ",n);
		}else {
			System.out.printf("\n O número %d não foi encontrado!",n);
		}
		
	}

}
