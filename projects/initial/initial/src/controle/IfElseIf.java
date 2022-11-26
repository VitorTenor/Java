package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 10) {
            System.out.println("Invalida");
        } else {
            System.out.println("Valida");
        }

        entrada.close();
    }
}
