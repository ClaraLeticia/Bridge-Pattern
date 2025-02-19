package concreteImplementor;

import implementor.Configuracao;

public class Biplano implements Configuracao {
    @Override
    public void gerarConfiguracao() {
        System.out.println("Biplano criado");
    }
}
