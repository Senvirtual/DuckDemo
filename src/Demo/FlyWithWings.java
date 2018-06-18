package Demo;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("用翅膀飞");
    }
}
