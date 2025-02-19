package abstraction;

import implementor.Configuracao;

public abstract class SuperficieControle {
    private Configuracao configuracao;

    public SuperficieControle(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public void gerarSuperficie(){
        configuracao.gerarConfiguracao();
    }
}
