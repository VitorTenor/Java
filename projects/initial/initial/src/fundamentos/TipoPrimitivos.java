package fundamentos;

public class TipoPrimitivos {
    public static void main(String[] args) {

        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 2_134_845_223;
        long pontosAcumuladosLong = 6_134_845_223L;


        // tipos numericos reais
        float salarioFloat = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; // ou true

        // tipo caractere
        char status = 'A'; // apenas um valor

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // ponto por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha ->" + salarioFloat);
        System.out.println("Ferias?" + estaDeFerias);
        System.out.println("Status:" + status);

    }
}
