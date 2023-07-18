// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {

    private static Map<String, Integer> estoque = new HashMap<>();
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
                    adicionarProduto(sc);
                    break;
                case  2:
                    removerProduto(sc);
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
public static void adicionarProduto(Scanner sc){
    System.out.print("Informe o nome do produto: ");
    String nome = sc.next();
    System.out.print("Informe a quantidade a ser adicionada: ");
    int qtd = sc.nextInt();

    if (estoque.containsKey(nome)){
        int quantidadeAtual = estoque.get(nome);
        quantidadeAtual += qtd;
        estoque.put(nome, quantidadeAtual);
    } else {
      estoque.put(nome, qtd);
    }

    System.out.println("Produto adicionado ao estoque. Quantidade atual: " + nome + ":" + estoque.get(nome ));

    }
public static void  removerProduto(Scanner sc){
    System.out.print("Informe o nome do produto: ");
        String nome = sc.next();
        if (!estoque.containsKey(nome)){
            System.out.println("Produto não encontrado no estoque.");
            return;
        }
        int quantidadeAtual = estoque.get(nome);
    System.out.print("Informe a quantidade a ser removida: ");
    int qtd = sc.nextInt();

    if (qtd > quantidadeAtual){
        System.out.println("Não é possivel remover essa quantidade. Estoque  atual:" + quantidadeAtual);
    } else {
        quantidadeAtual -= qtd;
        estoque.put(nome, quantidadeAtual);
        System.out.println("Produto removido do estoque. Quantidade atual:" + quantidadeAtual);
    }

}
public static void  consultarEstoque(){
        if (estoque.isEmpty()){
            System.out.println("Estoque vazio.");
        } else {
            for (Map.Entry<String, Integer> entry : estoque.entrySet()){
                String nome = entry.getKey();
                int quantidade = entry.getValue();
                System.out.println("Produto: " + nome + " - Quantidade: " + quantidade);
            }
        }

}
    }