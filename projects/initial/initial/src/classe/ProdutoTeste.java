package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4356.99);
        // p1.nome = "Notebook";
        // p1.preco = 4356.99;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        System.out.println(p2.preco);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        System.out.printf("%.2f\n%.2f", precoFinal2, precoFinal1);


    }
}
