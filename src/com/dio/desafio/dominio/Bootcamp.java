package com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import static com.dio.desafio.dominio.Impressoes.retornaLinhaHashtag;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Pessoa> devsInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = LocalDate.now();
        this.dataFinal = this.dataInicial.plusDays(45);
        this.devsInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Pessoa> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void inserirAluno(Pessoa devInscrito) {
        this.devsInscritos.add(devInscrito);
        ((Aluno) devInscrito).inscreverBootcamp(this);
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    private String retornaDevsInscritos() {
        String retorno = "";
        if (!devsInscritos.isEmpty()) {
            for(Pessoa aluno : devsInscritos) {
                retorno += aluno.toString();
            }
        } else {
            retorno = "\nAinda não há alunos inscritos.";
        }
        return retorno;
    }

    private String retornaConteudos() {
        String retorno = "";
        if (!conteudos.isEmpty()) {
            for(Conteudo conteudo : conteudos) {
                retorno += conteudo.toString();
            }
        } else {
            retorno = "Ainda não há conteúdos adicionados.";
        }
        return retorno;
    }

    public void exibirInscritos() {
        System.out.println("\n" + retornaLinhaHashtag() + "  BOOTCAMP\n" + nome + "\n" + descricao);
        System.out.println("I n s c r i t o s : ");
        if (!devsInscritos.isEmpty()) {
            for (Pessoa aluno : devsInscritos)
                System.out.println(aluno);
        } else {
            System.out.println("Não há alunos inscritos por enquanto.");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal);
    }

    @Override
    public String toString() {
        return "\n" +
                retornaLinhaHashtag() +
                "  B O O T C A M P\n" +
                nome +
                "\n" +
                descricao +
                "\n" +
                dataInicial.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                " > " +
                dataFinal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\n" +
                "> > >  A L U N O S   I N S C R I T O S" +
                retornaDevsInscritos() +
                "\n" +
                "> > >  C O N T E Ú D O S" +
                "\n" +
                retornaConteudos();

    }
}
