package exercisio.utilitarios;

import java.util.Random;

public class Aleatoriedade {
      
       public static void main(String[] args) {
               var Random = new Random();

               int valorAleatorio2 = random.nextInt();
               System.out.println(" Int aleatorio: %s".formatted(valorAleatorio2));

               int valorAleatorio = random.nextInt( 100);
               System.out.println(" Int aleatorio maximo 100: %s".formatted(valorAleatorio));

               double valorAleatorio3 = ramdom.nextDouble();
               System.out.println("double aleatorio maximo 100 %s".formatted(valorAleatorio3));

               double valorAleatorio4 = ramdom.nextDouble();
               System.out.println("double aleatorio maximo 100 %s".formatted(valorAleatorio4));
       }
}
