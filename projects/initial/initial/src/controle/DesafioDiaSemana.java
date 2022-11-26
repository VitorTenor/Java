package controle;

import javax.swing.*;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Informe o dia da semana:");

        dia = dia.toLowerCase();

        if (dia.equals("domingo")) {
            System.out.println("Dia 1");
        } else if (dia.equals("segunda")) {
            System.out.println("Dia 2");
        } else  if (dia.equals("terça")){
            System.out.println("Dia 3");
        } else if (dia.equals("quarta")){
            System.out.println("Dia 4");
        } else if (dia.equals("quinta")){
            System.out.println("Dia 5");
        } else if (dia.equals("sexta")) {
            System.out.println("Dia 6");
        } else if (dia.equals("sabado")) {
            System.out.println("Dia 7");
        } else {
            System.out.println("Dia invalido");
        }
    }
}
