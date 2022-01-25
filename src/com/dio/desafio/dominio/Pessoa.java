package com.dio.desafio.dominio;

public abstract class Pessoa {

    private String nome;
    private String pais;

    public Pessoa(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nome +
                " (" +
                pais +
                ")";
    }
}
