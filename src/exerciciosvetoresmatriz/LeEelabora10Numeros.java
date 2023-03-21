package exerciciosvetoresmatriz;

import java.util.Scanner;

public class LeEelabora10Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner (System.in);
int[]numeros = new int [10];
int soma = 0, x;
float media;

for(x = 0; x < 10; x++) {
	System.out.println( "\nDigite o número " + (x+1) + " : ");
	numeros [x] = leia.nextInt();
	soma += numeros [x];
	
}

System.out.println("\nNúmeros ímpares: ");
for (x = 1; x <10; x += 2) {
	System.out.print(numeros[x] + " ");
	
}
System.out.println();

System.out.println("\nNumeros pares: ");
for (x = 0; x <10; x++) {
	if (numeros [x] % 2 == 0)
	{
		System.out.println(numeros[x] + " ");
		
	}
	
	System.out.println();
	
	System.out.println("\nSoma dos números: " + soma);
	
	media = (float) soma /10;
	
	System.out.println( "Média dos números: " + media);
	
	leia.close();
}

	}

}
