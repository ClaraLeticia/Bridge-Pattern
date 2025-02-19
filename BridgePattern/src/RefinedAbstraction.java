/**
 *
 * Refined Abstraction, extende a classe abstrata definida em Abstraction
 *
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public String operation() {
        return this.implementor.implementation();
    }
}