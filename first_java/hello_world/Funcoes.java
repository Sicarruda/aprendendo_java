package first_java.hello_world;

public class Funcoes {
    public static void main(String[] args) {
        String nome = "Jessica";
        ola(nome);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    public static void ola(String nome) {
        System.out.println("Olá," + nome);
    }
    // CUIDADO COM A TIPAGEM AQUI O VOID VIRA INT
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

}
