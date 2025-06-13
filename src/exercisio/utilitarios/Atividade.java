package exercisio.utilitarios;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

      var entrada= new Scanner (System.in);


        System.out.println(" DIGITE O PRIMEIRO NUMERO:");
         int numero = entrada.nextInt();
         System.out.println(" DIGITE O SEGUNDO NUMERO:");
         int numero2 = entrada.nextInt();

         System.out.println( """
                  --------
                  Primeiro numero =%s
                  Segundo nuemro =%s
                  --------
                 """.formatted(numero, numero2) );

                 int menorValor = Math.min(numero, numero2);
        System.out.println(" menor valor entre %s e %s: %s"
                .formatted(numero, numero2, menorValor));

        int maiorValor = Math.max(numero, numero2);
        System.out.println("maior valor entre %s e %s: %s"
                .formatted(numero, numero2, maiorValor));

        double ceil = Math.ceil(Math.PI);
        System.out.println(" Ceil de PI: %s".formatted(ceil));

        double floor = Math.floor(Math.PI);
        System.out.println(" Floor de PI: %s".formatted(floor));

        double round = Math.round(Math.PI);
        System.out.println(" Round de PI: %s".formatted(round));






    }
}
