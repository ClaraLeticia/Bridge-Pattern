package refinedAbstraction;
import Implementor.TipoTransferencia;
import abstraction.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(TipoTransferencia tipoTransferencia) {
        super(tipoTransferencia);
    }

    @Override
    public void transferirDinheiro(double valor) {
        super.transferirDinheiro(valor);
    }
}
