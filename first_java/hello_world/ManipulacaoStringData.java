package first_java.hello_world;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStringData {
    public static void main(String[] args){
        String nome = "jEssIcA";
        String nome2 = "Jessica"; 
        //toLowerCase converte toda a String para caixa baixa
        System.out.println(nome.toLowerCase());
       
        //toUpperCase convertende toda a String para caixa alta
        System.out.println(nome.toUpperCase());
       
        //O método trim remove espaços em branco no inicial e no final da String
        System.out.println(nome.trim());
        
        //valueOf converte diversos tipos (booleano, inteiro, char, double, float, long, Object e etc) para String.
        boolean myBoolean = true;
        System.out.println(String.valueOf(myBoolean));
        float myFloat = -10;
        System.out.println(String.valueOf(myFloat));
        int myInt = 9;
        System.out.println(String.valueOf(myInt));
        double myDouble = 10.30;
        System.out.println(String.valueOf(myDouble));

        //comparando 2 strings
        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));

        // ISO 8601 define o formato padrão para datas
        LocalDate hoje = LocalDate.now();
        Locale brasil =  Locale.of("pt", "BR");

        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String data = String.valueOf(hoje); 

        //Print diferente aqui
        System.out.printf("Hoje é %s, %s, simbora %s!!%n", data, diaSemana, nome2);
      
    }   
          
}
