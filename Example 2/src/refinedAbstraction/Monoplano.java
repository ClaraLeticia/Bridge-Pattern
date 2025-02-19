package refinedAbstraction;

import abstraction.Configuracao;
import implementor.SuperficieComando;

public class Monoplano extends Configuracao {

    public Monoplano(SuperficieComando superficieComando, float parametro) {
        super(superficieComando, parametro);
    }

    @Override
    public void gerarSuperficie() {
        super.gerarSuperficie();
    }
}
