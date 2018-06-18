package Demo;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("用火箭喷射飞");
    }
}
