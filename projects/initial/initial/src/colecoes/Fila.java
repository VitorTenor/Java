package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

//        Offer e Add -> adicionam elemento na fila
//        Diferença de comportamento quando a fila esta cheia
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

//        Peek e Element -> busca elemento na fila
//        Diferença de comportamento quando a fila esta vazia
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();


//        Poll e Remove -> remove elemento na fila
//        Diferença de comportamento quando a fila esta vazia
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());


    }
}
