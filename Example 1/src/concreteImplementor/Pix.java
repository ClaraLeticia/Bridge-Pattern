package concreteImplementor;
import Implementor.TipoTransferencia;

public class Pix implements TipoTransferencia{
    @Override
    public void gerarTransferencia(double valor) {
        System.out.println("Transferência com valor " + valor + " via Pix realizada com sucesso!");
    }
}
