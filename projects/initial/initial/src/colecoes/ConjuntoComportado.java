package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//        Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<>();

        lista.add("Vitor");
        lista.add("A");
        lista.add("1");
        lista.add("Usuario");
        lista.add("Agua");

        System.out.println(lista);

        for (String exibir: lista){
            System.out.println(exibir);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int exibir : nums) {
            System.out.println(exibir);
        }

    }
}
