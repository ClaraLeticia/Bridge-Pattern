package abstraction;

import implementor.SuperficieComando;

public class Configuracao {
    private SuperficieComando superficieComando;
    private float parametro;

    public Configuracao(SuperficieComando superficieComando, float parametro) {
        this.superficieComando = superficieComando;
        this.parametro = parametro;
    }

    public void gerarSuperficie(){
        superficieComando.gerarSuperficie(parametro);
    }
}
