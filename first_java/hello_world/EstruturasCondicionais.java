package first_java.hello_world;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int nota = 70;
        String mensagem;
        boolean graduado;

        // if-else
        if (nota >= 70) {
            mensagem = "Aluno Aprovado";
        } else if (nota >= 50 && nota < 70) {
            mensagem = "Aluno Em Recupareção";
        } else {
            mensagem = "Aluno Reprovado";
        }

        switch (mensagem) {
            case "Aluno Aprovado":
                graduado = true;
                System.out.println(graduado);
                break;
            case "Aluno Em Recupareção":
            case "Aluno Reprovado":
                graduado = false;
                System.out.println(graduado);
                break;
            default:
                String mensagemErro = "Graduação invalida";
                System.out.println(mensagemErro);
                break;
        }
        
    }

}
