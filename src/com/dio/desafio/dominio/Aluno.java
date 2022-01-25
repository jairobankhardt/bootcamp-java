package com.dio.desafio.dominio;

import java.time.format.DateTimeFormatter;
import java.util.*;

import static com.dio.desafio.dominio.Impressoes.listaAlunos;

public class Aluno extends Pessoa {

    private Set<Bootcamp> bootcampsInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Aluno(String nome, String pais) {
        super(nome, pais);
        this.bootcampsInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
        listaAlunos.add(this);
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void setBootcampsInscritos(Set<Bootcamp> bootcampsInscritos) {
        this.bootcampsInscritos = bootcampsInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.bootcampsInscritos.add(bootcamp);
    }

    public void concluirConteudo(Conteudo conteudo) {
        if(!conteudosConcluidos.contains(conteudo)) {
            this.conteudosConcluidos.add(conteudo);
            //this.bootcampsInscritos.remove(conteudo);
        } else {
            System.err.println("Você já concluiu este conteúdo: ." + conteudo.getTitulo());
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public void exibirConteudosInscritos() {
        StringBuilder sbRetorno = new StringBuilder(this.toString());
        if (!this.bootcampsInscritos.isEmpty()) {
            for (Bootcamp b : this.bootcampsInscritos) {
                sbRetorno.append("\n\n*** BOOTCAMP ***\n");
                sbRetorno.append(b.getNome() + "\n");
                sbRetorno.append(b.getDescricao() + "\n");
                sbRetorno.append(b.getDataInicial().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                        " - " +
                        b.getDataFinal().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                        "\n");
                sbRetorno.append("\nCONTEÚDOS. [ ] -> inscrito.\n" +
                               "           [X] -> concluído\n");
                for (Conteudo c : b.getConteudos()) {
                    if (this.conteudosConcluidos.contains(c)) {
                        sbRetorno.append("[X] ");
                    } else {
                        sbRetorno.append("[ ] ");
                    }
                    if (c instanceof Curso ) {
                        sbRetorno.append("Curso: ");
                    } else {
                        sbRetorno.append("Mentoria: ");
                    }
                    sbRetorno.append(c.getTitulo() + "\n");
                }
            }
        } else {
            sbRetorno.append(this.getNome() + " não está inscrito em nenhum Bootcamp.");
        }
        System.out.print(sbRetorno);
    }

    public void conteudosConcluidosDoDev() {
        System.out.println();
        this.exibirConteudosInscritos();
        System.out.printf("\nXP acumulado até o momento: %.0f\n\n", this.calcularTotalXp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(super.getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getNome());
    }

    @Override
    public String toString() {
        return "Aluno(a) Dev: " +
                super.toString();
    }
}
