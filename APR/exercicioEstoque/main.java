import java.util.Scanner;
import java.util.Locale;

 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque product = new Estoque();
        System.out.println("Enter product data:");
        System.out.print("Digite o nome do produto: ");
        Estoque.Produto = sc.nextLine();
        System.out.print("preço do produto: ");
        Estoque.preco = sc.nextDouble();
        System.out.print("quantidade: ");
        Estoque.quantidade = sc.nextInt();

        System.out.println(Estoque.Produto + "," + Estoque.preco + "," + Estoque.quantidade);

    }
}
