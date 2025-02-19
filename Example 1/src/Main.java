import concreteImplementor.Doc;
import concreteImplementor.Pix;
import concreteImplementor.Ted;
import refinedAbstraction.ContaCorrente;
import refinedAbstraction.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix();
        Ted ted = new Ted();
        Doc doc = new Doc();

        ContaCorrente ccPix = new ContaCorrente(pix);
        ContaCorrente ccTed = new ContaCorrente(ted);
        ContaCorrente ccDoc =  new ContaCorrente(doc);

        ContaPoupanca cpPix = new ContaPoupanca(pix);
        ContaPoupanca cpTed = new ContaPoupanca(ted);

        System.out.println("Transferencias conta corrente");
        ccPix.transferirDinheiro(100);
        ccTed.transferirDinheiro(100);
        ccDoc.transferirDinheiro(200);

        System.out.println("Transferencias conta poupança");
        cpPix.transferirDinheiro(100);
        cpTed.transferirDinheiro(100);

    }
}