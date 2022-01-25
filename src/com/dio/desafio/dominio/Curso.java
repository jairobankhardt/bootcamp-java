package com.dio.desafio.dominio;

import static com.dio.desafio.dominio.Impressoes.retornaLinhaPontilhada;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, Professor professor, int cargaHoraria) {
        super(titulo, descricao, professor);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return //
                retornaLinhaPontilhada() +
                "Curso: " +
                super.toString() +
                super.getProfessor() +
                "\n";
    }


}
