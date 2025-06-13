package exercisio.utilitarios;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
         var entrada= new Scanner (System.in);

         System.out.println(" DIGITE SEU NOME:");
         String nome= entrada.nextLine();
         System.out.println(" DIGITE A SUA IDADE:");
         int idade = entrada.nextInt();
         System.out.println(" DIGITE SEU CEP:");
         int CEP = entrada.nextInt();
         
         System.out.println( """
                  --------
                  Nome=%s
                  Idade=%s
                  CEP=%s
                  --------
                 """.formatted(nome, idade, CEP) );

                 
    }
}
