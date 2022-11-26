package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog
                ("Informe o número:");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("PAR");
        }
        if (numero % 2 == 1) {
            System.out.println("IMPAR");
        }

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        boolean ehPar = numero % 2 == 0;
        if (ehPar) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }


    }
}
