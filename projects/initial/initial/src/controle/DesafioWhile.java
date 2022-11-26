package controle;

import javax.swing.*;

public class DesafioWhile {
    public static void main(String[] args) {
        Boolean i = true;

        while (i) {
            String something = JOptionPane.showInputDialog("Digite algo");
            if (something.equalsIgnoreCase("sair")){
                i = false;
            }
            System.out.println(something);
        }
    }
}
