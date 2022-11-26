package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // receber tres valores e casas decimais com ponto ou virgula
        // calcular media dos tres valores

        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nDigite o primeiro salario:");
        String primeirosal = entrada.nextLine()
                                    .replace(",", ".");

        System.out.printf("\nDigite o segundo salario:");
        String segundosal = entrada.nextLine()
                                    .replace(",", ".");

        System.out.printf("\nDigite o terceiro salario:");
        String terceirosal = entrada.nextLine()
                                    .replace(",", ".");

        double numero1 = Double.parseDouble(primeirosal);
        double numero2 = Double.parseDouble(segundosal);
        double numero3 = Double.parseDouble(terceirosal);

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A media é: " + media);

        entrada.close();

    }
}
