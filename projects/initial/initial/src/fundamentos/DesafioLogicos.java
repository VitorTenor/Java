package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean trab1 = true;
        boolean trab2 = false;

        boolean tv32 = trab1 ^ trab2;
        boolean tv50 = trab1 && trab2;
        boolean sorvete = trab1 || trab2;
        boolean casa = !sorvete;

        System.out.println("Ficou em casa: " + casa);
        System.out.println("Comprou TV 50: " + tv50);
        System.out.println("Comprou TV 32: " + tv32);
        System.out.println("Tomou sorvete: " + sorvete);

    }
}
