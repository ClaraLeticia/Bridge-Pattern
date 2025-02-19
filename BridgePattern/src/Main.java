import java.sql.Ref;

public class Main {
    public static void main(String[] args) {
        ConcreteImplementor CI = new ConcreteImplementor();

        RefinedAbstraction RF = new RefinedAbstraction(CI);

        System.out.println(RF.operation());

    }
}