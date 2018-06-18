package Demo;

public class MuteQuack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("这只鸭子不会叫");
    }
}
