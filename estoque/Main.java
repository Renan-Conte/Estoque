// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

    private static int quantidade = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;


        do{
            System.out.println("\n*** MENU DE OPÇÕES***");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Consultar estoque");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    adicionarProduto();
                    break;
                case  2:
                    removerProduto();
                    break;
                case 3:
                    consultarEstoque();
                case  0:
                    System.out.println("  Encerrando programa...");
                    break;
                default:
                    System.out.println(" opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
public static void adicionarProduto(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Informe a quantidade a ser adicionada: ");
    int qtd = sc.nextInt();
    quantidade += qtd;
    System.out.println("Produto adicionado ao estoque. Quantidade atual: " + quantidade);
}
public static void  removerProduto(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Informe a quantidade a ser removida: ");
    int qtd = sc.nextInt();
    if (qtd > quantidade){
        System.out.println("Não é possivel remover essa quantidade. Estoque  atual:" + quantidade);
    } else {
        quantidade -= qtd;
        System.out.println("Produto removido do estoque. Quantidade atual:" + quantidade);
    }

}
public static void  consultarEstoque(){
    System.out.print("Estoque atual: " + quantidade);
}
    }