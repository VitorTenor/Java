package fundamentos;

public class AreaCircuferencia {
    public static void main(String[] args) {
        int raio = 3;
        // final faz com que o valor nao possa ser alterado
        final double pi = 3.14159;
        double area = pi * raio *raio;
        System.out.println(area);
    }
}
