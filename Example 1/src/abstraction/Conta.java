package abstraction;
import Implementor.TipoTransferencia;
public abstract class Conta {
    private TipoTransferencia tipoTransferencia;

    public Conta(TipoTransferencia tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public void transferirDinheiro(double valor){
        tipoTransferencia.gerarTransferencia(valor);
    }
}
