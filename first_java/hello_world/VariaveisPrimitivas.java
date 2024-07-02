package first_java.hello_world;

public class VariaveisPrimitivas {
    public static void main(String[] args) {
        // linguagem fortemente tipada, é precisso declarar o tipo de variavel antes. 
        String nome;
        nome = "Jéssica";
        System.out.println("Olá, " + nome);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtração = a - b;
        int multiplicação = a * b;
        int divisaoInt = a / b;
        // o java entende que se as variaveis de uma conta forem int, mesmo que a variavel que as receba for um float o resultado é um int, para contornar isso usa-se um Cast, como abaixo 
        float divisaoFloat = (float) a / b;

        System.out.println(soma);
        System.out.println(divisaoInt);
        System.out.println(divisaoFloat);
        System.out.println(multiplicação);
        System.out.println(subtração);

        //Operadores de incremento e decremento +1 ou -1
        a++;
        b--;

    }
}
