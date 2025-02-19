package refinedAbstraction;

import Implementor.TipoTransferencia;
import abstraction.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(TipoTransferencia tipoTransferencia) {
        super(tipoTransferencia);
    }

    @Override
    public void transferirDinheiro(double valor) {
        super.transferirDinheiro(valor);
    }
}
