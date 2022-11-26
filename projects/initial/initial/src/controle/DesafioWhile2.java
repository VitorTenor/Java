package controle;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {
       // nota >= 0 && nota <= 10
        // armazenar todas as notas em um total
        // armazenar quantidade de notas validas
        // digite -1 para sair

        Scanner entrada = new Scanner(System.in);

        boolean i = true;
        double result = 0;
        double nota = 0;
        int cont = 0;

        do {
            System.out.print("Digite uma nota ou -1 para sair:");
            nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                result = result + nota;
                cont++;
                System.out.println("Nota Inserida.");
            }
            if (nota == -1) i = false;

        }while (i);

        System.out.println("Quantidade de notas validas digitadas: " + cont);
        System.out.println("Somar das Notas: " + result);
        System.out.println("Media das Notas: " + result / cont);

        entrada.close();

    }
}
