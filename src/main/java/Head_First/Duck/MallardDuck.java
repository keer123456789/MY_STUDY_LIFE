package Head_First.Duck;

import Head_First.Duck.FlyBehavior.FlyWithWings;
import Head_First.Duck.QuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    public void display() {
        System.out.println("I am a real Mallard duck");

    }

    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
