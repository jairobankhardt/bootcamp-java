package com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;
    private Professor professor;

    public abstract double calcularXp();

    public Conteudo(String titulo, String descricao, Professor professor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.professor = professor;
    }

    public Conteudo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return titulo +
                "\n" +
                descricao +
                "\n";
    }
}
