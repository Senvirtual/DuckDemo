package Demo;


public class MarllardDuck extends Duck {


    public MarllardDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
        super(quackbehavior, flybehavior);
    }

    public void display(){
        System.out.println("我是一只绿头鸭");
        performQuack();
        performFly();

    }
}
