package first_java.estrutura_de_dados.listas;

public class Pilha {
    private No topo;
    private int altura;

    class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    public Pilha(int valor) {
        No novoNo = new No(valor);
        topo = novoNo;
        altura = 1;
    }

    public void getTopo() {
        if (topo == null) {
            System.out.println("Pilha Vazia");
        } else {
            System.out.println("Topo: " + topo.valor);
        }
    }

    public void getAltura() {
        if (topo == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Altura: " + altura);
        }
    }

    public void print(){
        No temp = this.topo;
        System.out.println("########");
        while (temp != null) {
            System.out.println(temp.valor);
            temp = temp.proximo;
        }
        System.out.println("########");
    }

    public void inserir(int valor){
        No novoNo = new No(valor);
        if (altura == 0){
            topo = novoNo;
        } else{
            novoNo.proximo = topo;
            topo = novoNo;
        }

        altura++;
    }

    public No removerTopo(){
        if (altura == 0) return null;

        No temp = topo;
        topo = topo.proximo;
        temp.proximo = null;

        altura--;

        return temp;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        // pilha.getAltura();
        // pilha.getTopo();
        // pilha.print();

        pilha.inserir(4);
        pilha.inserir(3);
        pilha.inserir(2);
        pilha.inserir(1);
        pilha.print();

        // pilha.removerTopo();
        // pilha.print();


    }
}
