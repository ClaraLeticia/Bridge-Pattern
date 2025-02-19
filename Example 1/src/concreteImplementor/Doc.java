package concreteImplementor;

import Implementor.TipoTransferencia;

public class Doc implements TipoTransferencia {
    @Override
    public void gerarTransferencia(double valor) {
        System.out.println("Transferindo valor de "+ valor + " via DOC");
    }
}
