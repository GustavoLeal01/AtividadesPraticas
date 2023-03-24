package estruturadedados;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Filabanco {

    public static void main(String[] args) {

        Queue<String> filaClientes = new LinkedList<String>();

        Scanner leia= new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nBanco - Menu");
            System.out.println("1. Adicionar um novo Cliente na fila");
            System.out.println("2. Listar todos os Clientes na fila");
            System.out.println("3. Chamar (retirar) uma pessoa da fila");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    leia.nextLine();
                    String nomeCliente = leia.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente adicionado à fila: " + nomeCliente);
                    break;
                case 2:
                    System.out.println("Lista de clientes na fila:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (!filaClientes.isEmpty()) {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Cliente chamado da fila: " + clienteChamado);
                    } else {
                        System.out.println("Fila vazia. Não é possível chamar um cliente.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}