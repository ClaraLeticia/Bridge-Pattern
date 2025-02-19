package concreteImplementor;

import implementor.SuperficieComando;

public class Leme implements SuperficieComando {
    @Override
    public void gerarSuperficie(float parametro) {
        System.out.println("Leme criado com envergadura de " + 2 * parametro);
    }
}
