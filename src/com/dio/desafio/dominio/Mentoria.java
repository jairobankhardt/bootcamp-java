package com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import static com.dio.desafio.dominio.Impressoes.retornaLinhaPontilhada;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(String titulo, String descricao, Professor professor, String data) {
        super(titulo, descricao, professor);
        this.data = LocalDate.parse(data);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return //"\n" +
                retornaLinhaPontilhada() +
                "Mentoria: " +
                super.toString() +
                super.getProfessor() +
                "Data: " +
                this.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\n";
    }
}
