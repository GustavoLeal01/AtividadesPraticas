package atividadesRepeticao;

import java.util.Scanner;

public class numerospositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
int num, somaPositivos = 0;

do {
	System.out.println("\nDigite um número inteiro: ");
	num = leia.nextInt();
	
	if (num > 0) {
		somaPositivos += num;
		
	}
	
} while (num !=0);

System.out.println("\nA soma dos números positvios digitados é: " + somaPositivos);



	}

}
