package Head_First.Duck;

import Head_First.Duck.FlyBehavior.FlyNoWay;
import Head_First.Duck.FlyBehavior.FlyRocketPowered;
import Head_First.Duck.QuackBehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    public void display() {
        System.out.println("I am a model duck");
    }

    public static void main(String[] args) {
        Duck model =new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
