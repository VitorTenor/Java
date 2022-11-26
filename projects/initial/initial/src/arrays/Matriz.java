package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a quantidade de alunos: ");
        int qtdAlunos = entrada.nextInt();


        System.out.printf("Digite a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double [][] alunos = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[j]. length; j++) {
                System.out.printf("Informe a nota %d do aluno %d : ", j + 1, i + 1);
                alunos [i] [j] = entrada.nextDouble();
                total += alunos [i] [j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma é "+ media);


        entrada.close();
    }
}
