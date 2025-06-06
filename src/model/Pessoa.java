package model;

public class Pessoa {
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private Endereco endereco;
    private boolean dependentes;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(Long id, String nome, int idade, String email, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public boolean hasDependetes() {
        return dependentes;
    }

    public Long getId() {
        return id;
    }

    public void setDependentes(boolean dependentes) {
        this.dependentes = dependentes;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}