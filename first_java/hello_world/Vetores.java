package first_java.hello_world;

public class Vetores {
    public static void main(String[] args) {
        // não se mistura tipos dentro de um array, se for declarado int todos os elementos devem ser int
        // os indices se iniciam no 0

        int[] numeros = new int[5]; // declarei 5 posições nesse array
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        System.out.println(numeros); // retorna o local na memoria não o arry
        
        String[] letras = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < 5; i++){
            System.out.println(numeros[i]);
            System.out.println(letras[i]);
        }














    }
}
