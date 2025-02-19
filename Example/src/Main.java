import concreteImplementor.Biplano;
import concreteImplementor.Monoplano;
import refinedAbstraction.Aileron;
import refinedAbstraction.Leme;

public class Main {
    public static void main(String[] args) {
        Monoplano m1 = new Monoplano();
        Biplano b1 = new Biplano();

        Leme l1 = new Leme(m1);
        Aileron a1 = new Aileron(m1);


        Leme l2 = new Leme(b1);
        Aileron a2 = new Aileron(b1);

        l1.gerarSuperficie();
        a1.gerarSuperficie();

        l2.gerarSuperficie();
        a2.gerarSuperficie();

    }
}