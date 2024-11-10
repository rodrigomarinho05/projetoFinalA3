import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Produto> estoque = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");

            System.out.println("1.   Listar estoque");
            System.out.println("2. Criar produto");
            System.out.println("3. Deletar produto");
            System.out.println("4. Alterar produto");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    listarEstoque();
                    break;
                case 2:
                    criarProduto(scanner);
                    break;
            }
        } while (opcao != 0);
    }

    private static void listarEstoque() {
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("Marca: " + produto.getMarca());
            System.out.println("Modelo: " + produto.getModelo());
            System.out.println("Ano: " + produto.getAno());
            System.out.println("Preco: R$" + produto.getPreco());
            System.out.println("------------------------");
    
        }
    }

    // Método para criar um novo produto
    private static void criarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Escreva a descricao do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Qual a marca do produto: ");
        String marca = scanner.nextLine();

        System.out.print("Qual o modelo do produto: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Qual o ano de fabricacao do produto: ");
        int ano = scanner.nextInt();


        Peca novaPeca = new Peca(nome, descricao, marca, modelo, ano);
    
        estoque.add(novaPeca);
        System.out.println("Produto criado com sucesso!");
    }
}