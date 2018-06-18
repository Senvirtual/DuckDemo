package Demo;

public class Squack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("会吱吱叫");
    }
}
