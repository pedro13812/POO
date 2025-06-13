package exercisio.erro;

public class EscolhacorretaException extends Exception {
    public  EscolhacorretaException ( String escolha, String...opcoes) {
        super("""
                A  escolha "%s, nao é uma das seguintes opções validas 
                -%s
                """.formatted(escolha,String.join("\n-", opcoes)));
    }

}
