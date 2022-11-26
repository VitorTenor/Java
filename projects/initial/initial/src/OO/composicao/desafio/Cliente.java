package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double obterTotal () {
        double tot = 0;

        for (Compra c: compras) {
            tot += c.obterTotal();
        }
        return tot;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }
}
