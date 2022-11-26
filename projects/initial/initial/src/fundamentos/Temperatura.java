package fundamentos;

public class Temperatura {
    // main é o ponto de entrada
    public static void main(String[] args) {
        // (F - 32) X 5/9 = C
        double F = 86;
        final int fix = 32;
        final double fator = 5/9.0;
        double result = (F - fix) * fator;

        System.out.println(result + " °C");
    }
}
