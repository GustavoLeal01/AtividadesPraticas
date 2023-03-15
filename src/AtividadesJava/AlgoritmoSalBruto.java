package AtividadesJava;

import java.util.Scanner;

public class AlgoritmoSalBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o salário bruto: ");
		float SalarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno:"); 
		float Adicional = leia.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		float HorasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		float Descontos = leia.nextFloat();
		
		float SalarioLiquido = SalarioBruto + Adicional + HorasExtras *5 - Descontos;
		
		System.out.println("Salário Líquido :" + SalarioLiquido);
		
		
		
		
		
		
	}

}
