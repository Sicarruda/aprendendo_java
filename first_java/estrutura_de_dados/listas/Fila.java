package first_java.estrutura_de_dados.listas;

public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    class No<T> {
        T valor;
        No<T> proximo;

        No(T valor) {
            this.valor = valor;
        }
    }

    public Fila(T valor){
        No<T> novoNo = new No<>(valor);
        primeiroNo = novoNo;
        ultimoNo = novoNo;
        tamanho++;
    }

    public void getPrimeiroNo() {
        if (this.primeiroNo == null) {
            System.out.println("Fila vazia");
        } else {
            System.out.println(primeiroNo.valor);
        }
    }

    public void getUltimoNo() {
        if (this.primeiroNo == null) {
            System.out.println("Fila vazia");
        } else {
            System.out.println(ultimoNo.valor);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void print() {
        No<T> temp = this.primeiroNo;
        System.out.println("########");
        while (temp != null) {
            System.out.println(temp.valor);
            temp = temp.proximo;
        }
        System.out.println("########");
    }

    public void inserirFinal(T valor) {
        No<T> novoNo = new No<>(valor);

        if (tamanho == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            ultimoNo = novoNo;
        }

        tamanho++;
    }

    public No<T> removePrimeiro() {
        if (tamanho == 0)
            return null;

        No<T> temp = primeiroNo;
        primeiroNo = primeiroNo.proximo;
        temp.proximo = null;
        tamanho--;

        if (tamanho == 0) {
            primeiroNo = null;
            ultimoNo = null;
        }

        return temp;
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(0);
        
        // fila.getPrimeiroNo();
        // fila.getUltimoNo();
        // fila.getTamanho();
        // fila.print();

        fila.inserirFinal(1);
        fila.inserirFinal(2);
        fila.inserirFinal(3);
        fila.print();

        fila.removePrimeiro();
        fila.print();

    }
}
