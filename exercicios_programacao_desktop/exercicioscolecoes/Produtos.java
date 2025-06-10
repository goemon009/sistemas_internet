package br.com.ifmt.colecoes;

public class Produtos {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + '}';
    }
}
