package first_java.estrutura_de_dados.mercado;

public class SupermercadoArray implements Supermercado {

    private final String[] itens;
    private int ultimoIndex;

    public SupermercadoArray(final int tamanho) {
        itens = new String[tamanho];
        ultimoIndex = -1;
    }

    @Override
    public void adiciona(final String item) {
        if (ultimoIndex == itens.length - 1) {
            System.err.println("Lista cheia");
        } else {
            ultimoIndex++;
            itens[ultimoIndex] = item;
        }
    };

    @Override
    public void print() {
        System.out.println("#######################");

        if (ultimoIndex < 0) {
            System.out.println("Lista vazia");
        }

        for (int i = 0; i <= ultimoIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }

        System.out.println("#######################");
    };

    @Override
    public void delete(final int index) {
        if(index >= 0 && index <= ultimoIndex){
           moveUltimoElemento(index);
           ultimoIndex--;

        }else{
            System.err.println("Índice inválido");
        }
    };
    private void moveUltimoElemento(final int index) {
        for (int i = 0; i < ultimoIndex; i++){
            itens[i] = itens[i+1];
        }
    }
}
