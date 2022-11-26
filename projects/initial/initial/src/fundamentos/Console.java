package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" Dia!");

        System.out.println("Bom");
        System.out.println(" Dia!");

        // %d define o valor inteiro a ser apresentado
        // %s define a string a ser apresentada
        // %n quebra de linha
        System.out.printf("Megasena: %d %d %d %d %n", 1 , 2 , 3 , 4);
        System.out.printf("\nDecimal: %.1f", 123.4556789);

        // scanner
        // coleta informacoes do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nDigite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Nome: " + nome);

        System.out.printf("\nDigite seu sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.println("Sobrenome: " + sobrenome);

        System.out.printf("\nDigite suá idade:");
        int idade = entrada.nextInt();
        System.out.println("Idade: " + idade);

        entrada.close();
    }
}
