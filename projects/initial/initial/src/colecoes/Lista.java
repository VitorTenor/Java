package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(new Usuario("Vitor"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Bia"));

        System.out.println(lista.get(3));

        System.out.println(u1);

        for (Usuario u : lista) {
            System.out.println(u);
        }
    }
}
