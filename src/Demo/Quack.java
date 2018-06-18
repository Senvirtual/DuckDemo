package Demo;

public class Quack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("会呱呱叫");
    }
}
