public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            lista.addBloco(i);
        }

        lista.printLista();
    }
}