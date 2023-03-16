package lacoscondicionais;

import java.util.Scanner;

public class switchcargos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do colaborador: ");
		String nome = leia.nextLine();
		
		System.out.println("\nDigite o código do cargo (de 1 a 6): ");
		int codigo = leia.nextInt();
		
		System.out.println("\nDigite o salário: ");
		float salario = leia.nextInt();
		
		float NovoSalario = salario;
		
		switch(codigo) {
		
		case 1: NovoSalario *= 1.1f; // aumentou 10%
		System.out.println("\nCargo: Gerente ");
		break;
		case 2: NovoSalario *= 1.07f; // aumentou 7%
		System.out.println("\nCargo: Vendedor ");
		break;
		case 3: NovoSalario *= 1.09f; // aumentou 9%
		System.out.println("\nCargo: Supervisor ");
		break;
		case 4: NovoSalario *= 1.06f; // aumentou 6%
		System.out.println("\nCargo: Motorista ");
		break;
		case 5: NovoSalario *= 1.05f; // aumentou 5%
		System.out.println("\nCargo: Estoquista ");
		break;
		case 6: NovoSalario *= 1.08f; // aumentou 8%
		System.out.println("\nCargo:Técnico de TI ");
		break;
		
		default:
			System.out.println("Código Inválido!!!");
		}
		
		System.out.println("\nNome: " + nome);
		System.out.printf("\nValor salário: R$%.2f\n", NovoSalario);
		
			
		
	}

}
