package atividadesRepeticao;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
int menores21 = 0, maiores50 = 0;

while (true) {
	System.out.println("\nDigite a idade ");
	int idade = leia.nextInt();
	
	if(idade <0) {
		break;
	}
	
	if (idade <21) {
		menores21++;
		
	} else if (idade > 50) {
		maiores50++;
		
	
	}
}
System.out.println("\nTotal de pessoas com menos de 21 anos " + menores21);
System.out.println("\nTotal de pessoas maiores de 50 anos " + maiores50);

	}

}
