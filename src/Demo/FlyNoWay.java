package Demo;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("不会飞");
    }
}
