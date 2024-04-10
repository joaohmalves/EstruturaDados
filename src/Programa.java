public class Programa {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionar("AC");
        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());
    }
}
