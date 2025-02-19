import concreteImplementor.Leme;
import refinedAbstraction.Monoplano;

public class Main {
    public static void main(String[] args) {
        Leme leme = new Leme();
        Monoplano m1 = new Monoplano(leme, 4);

        m1.gerarSuperficie();
    }
}