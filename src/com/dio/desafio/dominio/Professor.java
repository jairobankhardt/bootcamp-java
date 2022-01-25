package com.dio.desafio.dominio;

public class Professor extends Pessoa{

    private int tempoDocencia;

    public Professor(String nome, String pais, int tempoDocencia) {
        super(nome, pais);
        this.tempoDocencia = tempoDocencia;
    }

    public int getTempoDocencia() {
        return tempoDocencia;
    }

    public void setTempoDocencia(int tempoDocencia) {
        this.tempoDocencia = tempoDocencia;
    }

    @Override
    public String toString() {
        return "Professor(a): " +
                super.toString() +
                " > Tempo de Docência: " +
                tempoDocencia +
                " anos";
    }
}
