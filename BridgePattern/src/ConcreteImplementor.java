/**
 *
 * ConcreteImplementatorA, implements Implementor interface
 *
 */
public class ConcreteImplementor implements Implementor {

    public String implementation() {
        return this.getClass().getName();
    }
}