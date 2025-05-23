package model;

public class Endereco {
    private String longradouro;
    private String cidade;
    private String cep;
    private Estados estado;

    public Endereco() {
    }
    public Endereco(String longradouro, String cidade, String cep, Estados estado) {
        this.longradouro = longradouro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }
    public String getLongradouro() {
        return longradouro;
    }
    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Estados getEstado() {
        return estado;
    }
    public void setEstado(Estados estado) {
        this.estado = estado;
    }

     

}
