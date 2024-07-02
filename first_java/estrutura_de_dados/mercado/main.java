package first_java.estrutura_de_dados.mercado;

import java.util.Scanner;

public class main {
    private final static int TAMANHO = 3;

    public static void main(String[] args) {
        //lê o teclado do usuário 
        Scanner scanner = new Scanner(System.in);
        Supermercado supermercado = new SupermercadoArray(TAMANHO);
        int opcao;

        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next(); //palavras simples
                    supermercado.adiciona(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite a opção a ser removida");
                    int index = scanner.nextInt();
                    supermercado.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;            
                default:
                    System.out.println("Opção invalida. Por favor tente novamente.");
                    break;
            }

        }while (opcao != 4);

    scanner.close();

    }
}
