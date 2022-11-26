package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // retorna o valor do indice
        System.out.println("Hello".charAt(0));

        String s = "Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s+"!!!");

        // retorna se inicia com TARDE ou nao
        System.out.println(s.startsWith("Tarde"));

        // retorna se termina com TARDE ou nao
        System.out.println(s.endsWith("Tarde"));

        // verifica se é igual ao argumento escrito
        System.out.println(s.equals("tarde"));

        // verrifica se é igual ao argumento escrito, ignorando a case
        System.out.println(s.equalsIgnoreCase("tarde"));

        var nome = "vitor";
        var sobrenome = "tenorio";

        // %s Valores String
        // %d Valores Inteiros
        System.out.printf("Nome: %s %s", nome, sobrenome);

        String frase = String.format("\nNome: %s %s", nome, sobrenome);
        System.out.println(frase);
    }
}
