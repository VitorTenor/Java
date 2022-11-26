package fundamentos;

public class DesafioAritmeticoMelhorado {
    public static void main(String[] args) {

        double superiorA = Math.pow(6 * (3 + 2), 2);
        double inferiorA = 3 * 2;
        double resultadoA = superiorA / inferiorA;

        double superiorB = (1 - 5) * (2 - 7);
        double inferiorB = 2;
        double resultadoB = Math.pow(superiorB / inferiorB, 2);

        double superior = Math.pow(resultadoA - resultadoB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;
        System.out.println(resultado);

    }
}
