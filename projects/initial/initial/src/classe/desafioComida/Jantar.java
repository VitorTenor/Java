package classe.desafioComida;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vitor", 75);

        Comida c1 = new Comida("PF", 0.5);
        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());


    }
}
