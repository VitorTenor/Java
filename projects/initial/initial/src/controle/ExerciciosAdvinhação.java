package controle;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosAdvinhação {
    public static void main(String[] args) {
        // advinhar uma numero 0 - 100
        // numero aleatorio em uma variavel
        // 10 tentativas
        // imprimir quantidade de tenativas restantes
        // imprimir se o numero inserido é menor ou maior que o armazenado

        Scanner entrada = new Scanner(System.in);
        int jokeNumber = 0;
        int tryPlay = 10;
        int number = 0;
        int continuePlay;


        do {
            System.out.println("Sorteando numero entre 0 e 100\n");
            Random randomNumber = new Random();
            jokeNumber = randomNumber.nextInt(101);
            do {
                tryPlay--;
                System.out.print("Digite um numero:");
                number = entrada.nextInt();

                if (number > jokeNumber) {
                    System.out.println("\n O numero sorteado é menor que o digitado.");
                    System.out.printf("Voce tem %d tentaivas. \n \n", tryPlay);
                } else if (number < jokeNumber) {
                    System.out.println("\nO numero sorteado é maior que o digitado.");
                    System.out.printf("Voce tem %d tentaivas. \n \n", tryPlay);
                } else {
                    System.out.println("\n \n Voce acertou!!!");
                }
                if (tryPlay == 10) System.out.println("\n \n Não foi dessa vez!");

            } while (jokeNumber != number && tryPlay > 0);

            System.out.println("\n \n \nPressione 0 para sair ou outro numero para continuar.");
            continuePlay = entrada.nextInt();

            if (continuePlay != 0) {
                System.out.println("\n Continuando ... \n");
                tryPlay = 10;
            }

        } while (continuePlay != 0);

        entrada.close();
    }
}
