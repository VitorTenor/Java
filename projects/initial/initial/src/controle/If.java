package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = entrada.nextDouble();

        if(media >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        entrada.close();
    }
}
