package OO.heranca.teste;

import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class Teste {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari(200);
        Civic c1 = new Civic();

        System.out.println(f1.velocidadeAtual);
        System.out.println(c1.velocidadeAtual);

        f1.ligarTurbo();
        f1.acelerar();
        f1.acelerar();
        f1.desligarTurbo();
        f1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();


        System.out.println();
        System.out.println(f1.velocidadeAtual);
        System.out.println(c1.velocidadeAtual);

        c1.freiar();
        f1.freiar();
        f1.freiar();
        f1.freiar();
        f1.freiar();
        f1.freiar();
        f1.freiar();
        f1.freiar();


        System.out.println();
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(f1.nivelDoAr());
    }

}
