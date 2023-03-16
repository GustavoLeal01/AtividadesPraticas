package lacoscondicionais;

import java.util.Scanner;

public class ifnegativopositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);

System.out.println("\nDigite um número: ");
int num= leia.nextInt();

if (num % 2 == 0) {
	System.out.println(num + "\nÉ um número par.");
} else {
	System.out.println(num + "\nÉ um número ímpar.");
}

if (num >= 0) {
	System.out.println(num + "\nÉ um número positivo. ");
} else { 
	System.out.println(num + "\nÉ um número negativo.");
	

}
	}

}
