package Demo;

public class RubberDuck extends Duck {
    public RubberDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
        super(quackbehavior, flybehavior);
    }

    public void display(){
        System.out.println("我是橡胶鸭");
        performQuack();
        performFly();
    }
}
