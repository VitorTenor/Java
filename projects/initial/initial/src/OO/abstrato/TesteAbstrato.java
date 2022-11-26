package OO.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        Mamifero b = new Cachorro();
        System.out.println(a.mover());
        System.out.println(b.mamar());
    }
}
