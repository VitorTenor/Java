package OO.heranca.desafio;

public class Carro {

    private int delta = 5;
    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;

    protected Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void freiar() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }


    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
        return "Velocidade atual é "+ velocidadeAtual;
    }


}
