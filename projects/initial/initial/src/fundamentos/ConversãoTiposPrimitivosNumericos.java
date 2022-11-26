package fundamentos;

public class ConversãoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.1234567; // explicita (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c; // explicita (CAST)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
