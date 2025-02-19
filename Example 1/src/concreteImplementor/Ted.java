package concreteImplementor;

import Implementor.TipoTransferencia;

public class Ted implements TipoTransferencia {
    @Override
    public void gerarTransferencia(double valor) {
        System.out.println("Transferência com valor " + valor + " via Ted realizada com sucesso!");
    }
}
