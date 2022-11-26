package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a quantidade de notas: ");
        int qtd = entrada.nextInt();

        double [] notas = new double [qtd];

        for (int i = 0; i < notas.length; i++ ) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        double result = 0;

        for (double v : notas) {
            result += v;
        }

        System.out.printf("A media do aluno é: %.2f", result / qtd);






        entrada.close();
    }
}
