package exercisio.erro;

import java.util.Scanner;

public class TratativasErros {
    public static void main(String[] args) {
        var tratativasErros = new TratativasErros();
        try {
            tratativasErros.arremessarErro();
        } catch (EscolhacorretaException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void arremessarErro() throws EscolhacorretaException {
        var entrada = new Scanner(System.in);
        String[] opcoes = { " Bola", " Carro", " Escada" };
        System.out.println("Digite uma das seguintes opcoes %s"
                .formatted(String.join(",", opcoes)));
        String escolha = entrada.nextLine().trim();

        if (!opcoes[0].equalsIgnoreCase(escolha)
                && !opcoes[1].equalsIgnoreCase(escolha)
                && !opcoes[2].equalsIgnoreCase(escolha)) {
            throw new EscolhacorretaException(escolha, opcoes);
        }
    }

    public void meuErro() {
        try {
            var entrada = new Scanner(System.in);
            String[] opcoes = { " Bola", " Carro", " Escada" };
            System.out.println("Digite uma das seguintes opcoes %s"
                    .formatted(String.join(",", opcoes)));
            String escolha = entrada.nextLine().trim();

            if (!opcoes[0].equalsIgnoreCase(escolha)
                    && !opcoes[1].equalsIgnoreCase(escolha)
                    && !opcoes[2].equalsIgnoreCase(escolha)) {
                throw new EscolhacorretaException(escolha, opcoes);
            }

        } catch (EscolhacorretaException e) {
            e.printStackTrace();
        }

    }

    private void testeTryCatch() {
        try {
            var entrada = new Scanner(System.in);
            System.out.println(" DIGITE SEU NUMERO:");
            int num1 = entrada.nextInt();
        } catch (Exception e) {
            System.out.println(" Valor informado deve ser um numero!");
            e.printStackTrace();
        }
        System.out.println("Fim");
    }
}
