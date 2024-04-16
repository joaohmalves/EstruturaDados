public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    //Metodo construtor, ao criar uma lista ela comeca com tamanho 0
    public ListaLigada(){
        this.tamanho = 0;
    }


    //Metodos get e set
    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //Metodo para adicionar novos elementos
    public void adicionar(String novoValor){
        //Cria um elemento novo utilizando o valor passado no metodo
        Elemento novoElemento = new Elemento(novoValor);

        //caso não tiver nenhum elemento na lista o primeiro e o ultimo elemento da lista serão o valor passado no metodo
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }

        //caso houver elementos na lista o ultimo da lista terá um proximo elemento que é o elemento adicionado
        //e o novo elemento adicionado se tornara o ultimo
        else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    //metodo de remover elemento por valor
    public void remover(String valorProcurado){

        //criação de variaveis para armazenar o elemento atual e o elemento anterior
        Elemento anterior = null;

        //o atual sempre comeca com o primeiro e vai indo pela lista toda
        Elemento atual = this.primeiro;

        //cria um for que percorre toda a lista
        for (int i =0; i < this.getTamanho() ; i++){

            //if que se o valor atual for igual o valor procurado

            if(atual.getValor().equalsIgnoreCase(valorProcurado)){
                //caso o elemento removido for o primeiro e ultimo(unico na lista) o primeiro e ultimo serao null
                if (atual == primeiro && atual== ultimo){
                    this.primeiro = null;
                    this.ultimo = null;
                }
                //se o elemento removido for o primeiro, o primeiro vai se tornar o proximo do removido
                else if(atual == primeiro){
                    primeiro = atual.getProximo();
                    atual.setProximo(null);

                }
                //se o elemento removido for o ultimo, o ultimo vai ser o anterior a ele
                else if(atual == ultimo){
                    ultimo = anterior;
                    anterior.setProximo(null);
                }
                else {
                    //o elemento anterior vai ter como o proximo, o proximo elemento do removido
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                //diminuio tamanho
                this.tamanho--;
                break;
            }

            //o anterior fica igual a o atual e o atual passa a ser o proximo
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    //busca de elementos por posicao
    public Elemento get(int posicao){

        //o atual sempre comeca com o primeiro e vai indo pela lista toda
        Elemento atual = this.primeiro;

        //for que percorre até a posicao digitada no metodo
        for(int i=0; i<posicao;i++){

            //caso o atual tiver um elemento proximo
            if (atual.getProximo()!=null){
                //o atual sera igual a o proximo elemento
                atual = atual.getProximo();
            }
    }

        return atual;
    }

}
