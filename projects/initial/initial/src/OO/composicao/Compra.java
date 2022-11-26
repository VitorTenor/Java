package OO.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem (String nome, int qtde, double preco) {
        this.adicionarItem(new Item(nome, qtde, preco));
    }

    void adicionarItem (Item item) {
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.qtde * item.preco;
        }

        return total;
    }

}
