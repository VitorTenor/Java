package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        // primeira parte
        double first = Math.pow(6 * (3+2), 2);
        first = first / (3*2);

        // segunda parte
        double second = ((1 - 5) * (2 - 7));
        second = Math.pow(second / 2, 2);

        // terceira parte
        double third = Math.pow(first - second, 3);

        // ultima parte
        double last = Math.pow(10, 3);
        last = third / last;

        System.out.println(last);
    }
}
