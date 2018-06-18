import Demo.*;

public class Main {

    public static void main(String[] args) {


        MarllardDuck mallardDuck=new MarllardDuck(new Quack(),new FlyWithWings());

        RedHeadDuck redHeadDuck = new RedHeadDuck( new Quack(), new FlyWithRocket());

        mallardDuck.display();
        redHeadDuck.display();

    }
}
