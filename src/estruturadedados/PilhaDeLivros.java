package estruturadedados;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<String>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String livro = leia.nextLine();
                    pilhaLivros.push(livro);
                    System.out.println("Livro adicionado à pilha.");
                    break;

                case 2:
                    System.out.println("Lista de livros na pilha:");
                    Iterator<String> iterator = pilhaLivros.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro '" + livroRetirado + "' retirado da pilha.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

}
