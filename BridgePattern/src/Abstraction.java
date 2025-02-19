/**
 *
 * Abstraction, define a classe de abstração, mantém a referência ao objeto Implementor
 *
 */
abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract String operation();
}