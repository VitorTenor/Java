package OO.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ing1 = new Arroz(0.2);
        Feijao ing2 = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.Comer(ing1);
        convidado.Comer(ing2);
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);
        convidado.Comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
