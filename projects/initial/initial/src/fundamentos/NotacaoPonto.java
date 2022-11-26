package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Hello X";
        s = s.toUpperCase();
        s = s.replace("X", "Replaced");
        s = s.concat ("!!!!");
        System.out.println(s);

        // outro jeito
        String y = "Hello2 X"
                .toUpperCase()
                .replace("X", "Replaced")
                .concat ("!!!!");
        System.out.println(y);

    }
}
