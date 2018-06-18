package Demo;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
        super(quackbehavior, flybehavior);
    }
    public void display(){
        System.out.println("我是一只红头鸭");
        performQuack();
        performFly();

    }
}
