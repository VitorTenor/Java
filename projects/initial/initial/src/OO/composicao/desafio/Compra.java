package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int qtde){
        this.itens.add(new Item(produto, qtde));
    }
    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome,preco);
        this.itens.add(new Item(produto, qtde));
    }



    double obterTotal () {
        double tot = 0;

        for (Item item: itens) {
            tot += item.qtde * item.produto.preco;
        }

        return tot;
    }
}
