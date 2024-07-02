package first_java.estrutura_de_dados.listas;

public class ListaLigada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    class No<T> {
        T data;
        No<T> proximo;

        No(T data) {
            this.data = data;
        }
    }

    public ListaLigada(T data) {
        tamanho = 1;
        No<T> novoNo = new No<>(data);
        primeiroNo = novoNo;
        ultimoNo = novoNo;
    }

    public void getPrimeiroNo() {
        if (this.primeiroNo == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println(primeiroNo.data);
        }
    }

    public void getUltimoNo() {
        if (this.primeiroNo == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println(ultimoNo.data);
        }
    }

    public No<T> get(int index) {
        if (index < 0 || index >= tamanho)
            return null;

        No<T> temp = primeiroNo;

        for (int i = 0; i < index; i++) {
            temp = temp.proximo;
        }

        return temp;
    }

    public void getTamanho() {
        System.out.println("tamanho: " + tamanho);
    }

    public boolean alterar(T data, int index) {
        No<T> temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public void listaVazia() {
        primeiroNo = null;
        ultimoNo = null;
        tamanho = 0;
    }

    public void print() {
        No<T> temp = this.primeiroNo;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.proximo;
        }
    }

    public void inserirFinal(T data) {
        No<T> novoNo = new No<>(data);

        if (tamanho == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            ultimoNo = novoNo;
        }

        tamanho++;
    }

    public void inserirInicio(T data) {
        No<T> novoNo = new No<>(data);

        if (tamanho == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.proximo = primeiroNo;
            primeiroNo = novoNo;
        }

        tamanho++;
    }

    public boolean inserir(T data, int index) {
        if (index < 0 || index > tamanho)
            return false;
        if (index == 0) {
            inserirInicio(data);
            return true;
        }
        if (index == tamanho) {
            inserirFinal(data);
            return true;
        }

        No<T> novoNo = new No<>(data);
        No<T> temp = get(index - 1);

        novoNo.proximo = temp.proximo;
        temp.proximo = novoNo;

        tamanho++;

        return true;
    }

    public No<T> removerUltimoNo() {
        if (tamanho == 0)
            return null;

        No<T> anteriorNo = primeiroNo;
        No<T> temp = null;

        while (anteriorNo.proximo != ultimoNo) {
            anteriorNo = anteriorNo.proximo;
        }

        temp = ultimoNo;
        ultimoNo = anteriorNo;
        ultimoNo.proximo = null;

        tamanho--;
        if (tamanho == 0) {
            primeiroNo = null;
            ultimoNo = null;
        }

        return temp;
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

    public No<T> remove(int index) {
        if (tamanho < 0 || index >= tamanho)
            return null;

        if (index == 0)
            return removePrimeiro();

        if (index == tamanho - 1)
            return removerUltimoNo();

        No<T> anterior = get(index - 1);
        No<T> temp = anterior.proximo;

        anterior.proximo = temp.proximo;
        temp.proximo = null;
        tamanho--;

        return temp;
    }

    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<>("elemento 1");

        lista.inserirFinal("elemento 2");
        lista.inserirFinal("elemento 3");
        lista.inserirInicio("elemento 0");
        lista.inserir("lalalulu", 3);
        // lista.getPrimeiroNo();
        // lista.getUltimoNo();
        // lista.getTamanho();

        // System.out.println("####################");
        // lista.print();

        lista.alterar("elemento 2,5", 3);
        // System.out.println(lista.removePrimeiro().data);

        System.out.println("####################");
        lista.print();

        lista.remove(3);

        System.out.println("####################");
        lista.print();

        // System.out.println(lista.get(1).data);
    }
}
