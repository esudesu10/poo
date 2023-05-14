package Exercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n*** MENU ***");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Consultar aluno");
            System.out.println("3 - Alterar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Matrícula: ");
                    int matricula = input.nextInt();
                    Aluno novoAluno = new Aluno(nome, matricula);
                    alunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Matrícula: ");
                    int matriculaConsulta = input.nextInt();
                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula() == matriculaConsulta) {
                            System.out.println("Nome: " + aluno.getNome());
                            System.out.println("Matrícula: " + aluno.getMatricula());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Matrícula: ");
                    int matriculaAlteracao = input.nextInt();
                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula() == matriculaAlteracao) {
                            System.out.print("Novo nome: ");
                            String novoNome = input.next();
                            aluno.setNome(novoNome);
                            System.out.println("Nome alterado com sucesso!");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Matrícula: ");
                    int matriculaRemocao = input.nextInt();
                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula() == matriculaRemocao) {
                            alunos.remove(aluno);
                            System.out.println("Aluno removido com sucesso!");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(opcao != 5);
    }
}
