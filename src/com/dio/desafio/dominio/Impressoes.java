package com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impressoes {

    private static final String linhaPontilhada = "- - - - - - - - - -";
    private static final String linhaHashtag = "# # # # # # # # # # ";
    public static List<Aluno> listaAlunos = new ArrayList<>();

    public static String retornaLinhaPontilhada() {
        return linhaPontilhada + "\n";
    }

    public static String retornaLinhaHashtag() {
        return linhaHashtag;
    }

    public static void esperarSegundos(int segundos) throws InterruptedException {
        for (int i = 1; i <= segundos; i++) {
            System.out.print(".  ");
            Thread.sleep(1000);
        }
    }

    public static void continuarComEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pressione <Enter> para continuar: ");
        sc.nextLine();
    }

    public static void menuAlunosDesenvolvedores() {
        if (!listaAlunos.isEmpty()) {
            System.out.print("\n> > > >  L I S T A   D E   D E V S  < < < <\n");
            for (int i=1; i <= listaAlunos.size(); i++) {
                System.out.println(i + " - " + listaAlunos.get(i-1).toString());
            }
            System.out.print("ESCOLHA UM ALUNO DESENVOLVEDOR (0 para sair): ");
        } else {
            System.out.println("Não há alunos inscritos em nenhum bootcamp.");
        }
    }

    public static void verificarOpcao(int opcao) {
        if (opcao == 0) {
            System.out.println("\nPROGRAMA FINALIZADO.\nOBRIGADO PELA SUA PARTICIPAÇÃO.");
        } else if (opcao < 1 || opcao > listaAlunos.size()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nOpção inválida. Tente novamente.");
            menuAlunosDesenvolvedores();
            verificarOpcao(sc.nextInt());
        } else {
            listaAlunos.get(opcao-1).conteudosConcluidosDoDev();
        }
    }
}
