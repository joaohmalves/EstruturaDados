public class Programa {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());
        System.out.println(lista.get(2).getValor());

        //removendo elemento

        //Imprimindo todos antes de remoção
        System.out.println("Antes");
        for (int i=0; i< lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        //Removendo
        lista.remover("CE");

        //Imprimindo apos remoção
        System.out.println("Depois");
        for (int i=0; i< lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
