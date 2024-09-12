public class Lista {
    Bloco inicio;

    // Método para adicionar um bloco à lista
    public Bloco addBloco(int valor) {
        Bloco novo = new Bloco(valor);
        novo.proximo = inicio;
        inicio = novo;
        return novo;
    }

    // Método para imprimir a lista
    public void printLista() {
        Bloco aux = inicio;


        while (aux != null) {
            System.out.print(aux.valor);

            if (aux.proximo != null) {
                System.out.print(" -> ");
            }
            aux = aux.proximo;
        }
        System.out.println(" -> Fim da lista!");
    }
}