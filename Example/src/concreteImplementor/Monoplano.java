package concreteImplementor;

import implementor.Configuracao;

public class Monoplano implements Configuracao {
    @Override
    public void gerarConfiguracao() {
        System.out.println("Monoplano criado");
    }
}
