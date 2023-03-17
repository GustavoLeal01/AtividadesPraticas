package atividadesRepeticao;

import java.util.Scanner;

public class SomadeTodososNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);

int num, soma3 = 0, multi3 = 0;

do {
	System.out.println("\nDigite um número inteiro: ");
	num = leia.nextInt();
	
	if (num % 3 == 0 && num !=0) {
		soma3 += num;
		multi3++;
		
	}
	
} while (num !=0);

double media = (double) soma3 / multi3;

System.out.println("\nA média dos números múltiplos de 3 é: " + media);
	}

}
