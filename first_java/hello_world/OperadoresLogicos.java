package first_java.hello_world;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean fimDeSemana = false;
        boolean fazendoSol = true;

        boolean vamosAPraiaAND = fimDeSemana && fazendoSol;
        boolean vamosAPraiaOR = fimDeSemana || fazendoSol;

        System.out.println(vamosAPraiaAND);
        System.out.println(vamosAPraiaOR);

        // operador logico
        // E -> && 
        // OU -> || 
    
        // operador ternario = variavel se verdadeira se não verdadeira
        // variavel = fimDeSemana; se(if) = ?; condição verdadeira = "É fim de semana" caso contrario =  : condição falsa = "Não é fim de semana"

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);        

        //Operadores de igualdade == ou !=
        boolean mensagem2 = vamosAPraiaAND == vamosAPraiaOR ? true : false;
        System.out.println(mensagem2);
        
    }
    
    
}
