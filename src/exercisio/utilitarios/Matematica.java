package exercisio.utilitarios;

public class Matematica {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 6;
        int menorValor = Math.min(valorA, valorB);
        System.out.println(" menor valor entre %s e %s: %s"
                .formatted(valorA, valorB, menorValor));

        int maiorValor = Math.max(valorA, valorB);
        System.out.println("maior valor entre %s e %s: %s"
                .formatted(valorA, valorB, maiorValor));

        double ceil = Math.ceil(Math.PI);
        System.out.println(" Ceil de PI: %s".formatted(ceil));

        double floor = Math.floor(Math.PI);
        System.out.println(" Floor de PI: %s".formatted(floor));

        double round = Math.round(Math.PI);
        System.out.println(" Round de PI: %s".formatted(round));

    }
}
