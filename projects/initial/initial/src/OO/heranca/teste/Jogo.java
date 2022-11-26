package OO.heranca.teste;

import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(10, 11);


        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println(heroi.vida);
        System.out.println(monstro.vida);


        heroi.atacar(monstro);
        monstro.atacar(heroi);


        System.out.println("Heroi tem: " + heroi.vida);
        System.out.println("Monstro tem: " + monstro.vida);
    }
}
