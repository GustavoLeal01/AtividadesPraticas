package AtividadesJava;

import java.util.Scanner;

public class AlgoritmoSalario {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);

System.out.println("Digite o salário: ");
float salario = leia.nextFloat();
System.out.println("digite o valor do abono: ");
float abono = leia.nextFloat();

float novosalario = salario + abono;

System.out.println("novo salário: " + novosalario);




	}

}
