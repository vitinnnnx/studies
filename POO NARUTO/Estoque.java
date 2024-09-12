public class Estoque {
    public static int quantidade;
    public static double preco;
    public static String Produto;

    public double valorEmEstoque(){
        return preco * quantidade;
    }

    public void adicionaEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeEstoque(int quantidade){
        this.quantidade -= quantidade;
    }


}
