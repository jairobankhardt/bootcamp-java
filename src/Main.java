import com.dio.desafio.dominio.*;

import java.util.*;

import static com.dio.desafio.dominio.Impressoes.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nVamos começar.\n\n");

        System.out.println("*** PRIMEIRO IREMOS CADASTRAR OS PROFESSORES E PROFESSORAS ***");
        continuarComEnter();
        Pessoa profAlbert = new Professor("Albert Einstein", "Alemanha", 2);
        Pessoa profLeonardo = new Professor("Leonardo da Vinci", "Itália", 5);
        Pessoa profaMarie = new Professor("Marie Curie", "Polônia", 4);
        Pessoa profWilliam = new Professor("William Shakespeare", "Inglaterra", 3);
        Pessoa profaHipatia = new Professor("Hipátia", "Grécia", 7);
        System.out.println(profAlbert);
        System.out.println(profLeonardo);
        System.out.println(profaMarie);
        System.out.println(profWilliam);
        System.out.println(profaHipatia);

        System.out.println();
        System.out.println("*** AGORA É A VEZ DE CADASTRAR OS ALUNOS DESENVOLVEDORES ***");
        continuarComEnter();
        Pessoa devAda = new Aluno("Ada Lovelace", "Inglaterra");
        Pessoa devDonald = new Aluno("Donald Knuth", "EUA");
        Pessoa devGrace = new Aluno("Grace Murray Hopper", "EUA");
        Pessoa devVint = new Aluno("Vint Cerf", "Inglaterra");
        Pessoa devHedy = new Aluno("Hedy Lamarr", "EUA");
        Pessoa devRay = new Aluno("Ray Tomlinson", "EUA");
        Pessoa devBill = new Aluno("Bill Gates", "EUA");
        Pessoa devRamus = new Aluno("Rasmus Lerdorf", "Groelândia");
        Pessoa devJames = new Aluno("James Gosling", "Canadá");
        Pessoa devRichard = new Aluno("Richard Matthew Stallman", "EUA");
        System.out.println(devAda);
        System.out.println(devDonald);
        System.out.println(devGrace);
        System.out.println(devVint);
        System.out.println(devHedy);
        System.out.println(devRay);
        System.out.println(devBill);
        System.out.println(devRamus);
        System.out.println(devJames);
        System.out.println(devRichard);

        System.out.println();
        System.out.println("*** PRECISAMOS DE CONTEÚDOS. VAMOS COMEÇAR CADASTRANDO OS CURSOS... ***");
        continuarComEnter();
        Conteudo cursoJava = new Curso("POO com Java",
                               "Aprenda os fundamentos da Programação Orientada a Objetos usando a sintaxe da linguagem Java.",
                                       (Professor) profLeonardo,
                             4);
        Conteudo cursoPython = new Curso("Python na prática",
                "Desenvolva suas habilidades com Python desde o básico até o avançado",
                (Professor) profaHipatia,
                10);
        Conteudo cursoFull = new Curso("FullStack",
                "Seja um desenvolvedor FullStack com este curso que te deixará pronto para qualquer desafio.",
                (Professor) profAlbert,
                14);
        Conteudo cursoGit = new Curso("Versionamento com Git",
                "Aqui você irá aprender não só a versionar seus projetos com o Git, como terá noções de Linux e GitHub",
                (Professor) profaMarie,
                3);
        System.out.print(cursoJava);
        System.out.print(cursoPython);
        System.out.print(cursoFull);
        System.out.print(cursoGit);

        System.out.println();
        System.out.println("*** ... E AS MENTORIAS ***");
        continuarComEnter();
        Conteudo mentoriaSoft = new Mentoria("SoftSkills",
                                    "Quais são as softskills necessárias em qualquer ambiente de trabalho?",
                                             (Professor) profaMarie,
                                        "2022-01-22");
        Conteudo mentoriaCodigo = new Mentoria("Como escrever um Código Limpo",
                "Cada vez mais são necessários profissionais que escrevem um bom código.",
                (Professor) profWilliam,
                "2022-02-04");
        System.out.print(mentoriaSoft);
        System.out.print(mentoriaCodigo);

        System.out.println();
        System.out.println("*** CHEGOU A HORA DE MONTARMOS OS BOOTCAMPS ***");
        continuarComEnter();
        Bootcamp bootcampDesenvolve = new Bootcamp("Desenvolvendo em várias Linguagens",
                "Aprendendo a sintaxe e a estrutura em diversas Linguagens de Programação.");
        bootcampDesenvolve.adicionarConteudo(cursoPython);
        bootcampDesenvolve.adicionarConteudo(cursoGit);
        bootcampDesenvolve.adicionarConteudo(cursoJava);
        bootcampDesenvolve.adicionarConteudo(mentoriaCodigo);
        bootcampDesenvolve.adicionarConteudo(mentoriaSoft);
        Bootcamp bootcampWeb = new Bootcamp("Formação para profissionais com foco em Web",
                "Treinamento prático sobre as tecnologias para desenvolvimento Web.");
        bootcampWeb.adicionarConteudo(cursoFull);
        bootcampWeb.adicionarConteudo(cursoGit);
        bootcampWeb.adicionarConteudo(mentoriaCodigo);
        System.out.print(bootcampDesenvolve);
        esperarSegundos(3);
        System.out.print(bootcampWeb);

        System.out.println();
        System.out.println("*** COM ESTES BOOTCAMPS TENHO CERTEZA QUE OS ALUNOS ESTÃO ANSIOSOS PARA COMEÇAR.");
        System.out.println("IRÃO SE INSCREVER AGORA ***");
        continuarComEnter();
        bootcampWeb.inserirAluno(devAda);
        bootcampWeb.inserirAluno(devBill);
        bootcampWeb.inserirAluno(devHedy);
        bootcampWeb.inserirAluno(devDonald);
        bootcampWeb.inserirAluno(devVint);
        bootcampWeb.inserirAluno(devRamus);
        bootcampWeb.exibirInscritos();
        bootcampDesenvolve.inserirAluno(devGrace);
        bootcampDesenvolve.inserirAluno(devRichard);
        bootcampDesenvolve.inserirAluno(devAda);
        bootcampDesenvolve.inserirAluno(devVint);
        bootcampDesenvolve.inserirAluno(devAda);
        bootcampDesenvolve.inserirAluno(devJames);
        bootcampDesenvolve.inserirAluno(devBill);
        bootcampDesenvolve.inserirAluno(devHedy);
        bootcampDesenvolve.inserirAluno(devRay);
        bootcampDesenvolve.inserirAluno(devDonald);
        bootcampDesenvolve.exibirInscritos();

        System.out.println("\n");
        System.out.println("Alguns dias depois...");
        esperarSegundos(5);
        System.out.println("\nOS ALUNOS ESTÃO ESTUDANDO COM DEDICAÇÃO.");
        System.out.println("ALGUNS ATÉ TERMINARAM SEU BOOTCAMP.");
        System.out.println("VAMOS CONFERIR OS CONTEÚDOS CONCLUÍDOS.");
        ((Aluno) devAda).concluirConteudo(cursoFull);
        ((Aluno) devAda).concluirConteudo(cursoGit);
        ((Aluno) devAda).concluirConteudo(mentoriaCodigo);
        ((Aluno) devAda).concluirConteudo(cursoJava);
        ((Aluno) devBill).concluirConteudo(cursoGit);
        ((Aluno) devBill).concluirConteudo(cursoPython);
        ((Aluno) devBill).concluirConteudo(cursoJava);
        ((Aluno) devBill).concluirConteudo(cursoFull);
        ((Aluno) devHedy).concluirConteudo(cursoFull);
        ((Aluno) devHedy).concluirConteudo(cursoPython);
        ((Aluno) devHedy).concluirConteudo(mentoriaCodigo);
        ((Aluno) devHedy).concluirConteudo(mentoriaSoft);
        ((Aluno) devDonald).concluirConteudo(mentoriaSoft);
        ((Aluno) devGrace).concluirConteudo(cursoGit);
        ((Aluno) devGrace).concluirConteudo(cursoJava);
        ((Aluno) devGrace).concluirConteudo(cursoPython);
        ((Aluno) devGrace).concluirConteudo(mentoriaCodigo);
        ((Aluno) devGrace).concluirConteudo(mentoriaSoft);
        ((Aluno) devJames).concluirConteudo(cursoJava);
        ((Aluno) devJames).concluirConteudo(cursoPython);
        ((Aluno) devJames).concluirConteudo(mentoriaSoft);
        ((Aluno) devRamus).concluirConteudo(cursoJava);
        ((Aluno) devRamus).concluirConteudo(cursoPython);
        ((Aluno) devRamus).concluirConteudo(cursoFull);
        ((Aluno) devRamus).concluirConteudo(mentoriaCodigo);
        ((Aluno) devRay).concluirConteudo(cursoGit);
        ((Aluno) devRay).concluirConteudo(cursoPython);
        ((Aluno) devRay).concluirConteudo(mentoriaSoft);
        ((Aluno) devRichard).concluirConteudo(cursoJava);
        ((Aluno) devRichard).concluirConteudo(cursoGit);
        ((Aluno) devRichard).concluirConteudo(cursoPython);
        ((Aluno) devRichard).concluirConteudo(mentoriaCodigo);
        ((Aluno) devVint).concluirConteudo(cursoFull);
        ((Aluno) devVint).concluirConteudo(cursoGit);
        ((Aluno) devVint).concluirConteudo(cursoJava);
        ((Aluno) devVint).concluirConteudo(mentoriaCodigo);
        ((Aluno) devVint).concluirConteudo(mentoriaSoft);
        int opcao = 1;
        while(opcao != 0) {
            try {
                Scanner sc = new Scanner(System.in);
                menuAlunosDesenvolvedores();
                opcao = sc.nextInt();
                verificarOpcao(opcao);
            } catch (InputMismatchException ex) {
                System.out.println("\n### Erro. Você deve digitar um número inteiro.");
            }
        }
    }
}
