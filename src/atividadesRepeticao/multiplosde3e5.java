package atividadesRepeticao;

import java.util.Scanner;

public class multiplosde3e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);

System.out.println("\nDigite o primeiro numero: ");
int num1 = leia.nextInt();

System.out.println("\nDigite o segundo numero: ");
int num2 = leia.nextInt();

if(num1 >= num2) {
	System.out.println("\n INVÁLIDO!! ");
	
} else {
System.out.println("\nNúmeros múltiplos de 3 e 5 entre: " + num1 + " e " + num2 + ":" );

for (int x = num1; x <= num2; x++) {
	if (x % 3 == 0 && x % 5 ==0) {
		System.out.println(x);
	}
	
}

}
	}

}
