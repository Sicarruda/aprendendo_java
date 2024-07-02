package first_java.estrutura_de_dados.listas;

public class Arvore {
    public No noRaiz;

    public class No {
        public int valor;
        public No noDireita;
        public No noEsquerda;

        public No(int valor) {
            this.valor = valor;
        }

        public boolean isFolha() {
            return (this.noEsquerda == null) && (this.noDireita == null);
        }
    }

    public void inserir(int valor){
        if (noRaiz == null) noRaiz = new No(valor);
        else{
            No novoNo = new No(valor);
            Fila<No> fila = new Fila<>(noRaiz);
            fila.inserirFinal(noRaiz);
            while (fila.getTamanho() > 0) {
                           
            }
        }
    }

}
