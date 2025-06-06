import model.Endereco;
import model.Estados;
import model.Pessoa;
import model.Trabalhador;
import util.ClonarEndereco;

public class App {
        public static void main(String[] args) {

                var pessoa = new Pessoa(
                                "Pedro",
                                15,
                                "pedro@email.com",
                                " 5199999997777777");

                System.out.println(pessoa);

                var trabalhador = new Trabalhador(
                                "Pedro",
                                15,
                                "pedro@email.com",
                                " 5199999997777777",
                                "Supervisor", 3500);

                System.err.println(trabalhador);

        }

        public void oopBasico() {

                var pessoa = new Pessoa(
                                "Pedro",
                                15,
                                "pedro@email.com",
                                " 5199999997777777");
                System.err.println(" nome: %s".formatted(pessoa.getNome()));

                var endereco1 = new Endereco(
                                "rua x",
                                "NH",
                                "93335528",
                                Estados.RS);
                pessoa.setEndereco(endereco1);

                pessoa.setNome("Pedro silva");
                System.out.println("nome: %s".formatted(pessoa.getNome()));

                var pessoa2 = new Pessoa();
                pessoa2.setEmail("joao@email.com");
                pessoa2.setIdade(16);
                pessoa2.setNome("Joao");
                pessoa2.setTelefone("515555555555");
                pessoa2.setEndereco(
                                new ClonarEndereco().clonar(endereco1));

                System.err.println(" nome: %s".formatted(pessoa.getNome()));

                pessoa2.setNome("Joao pedro");
                System.out.println("nome: %s".formatted(pessoa.getNome()));

                String cep = pessoa.getEndereco().getCep();
                System.out.println("CEP: %s".formatted(cep));

                String cep2 = pessoa2.getEndereco().getCep();
                System.out.println("CEP: %s".formatted(cep2));

                pessoa2.getEndereco().setCep("933111-11");
                System.out.println("CEP 1 = %s".formatted(pessoa.getEndereco().getCep()));
                System.out.println("CEP 2 = %s".formatted(pessoa2.getEndereco().getCep()));

        }
}
