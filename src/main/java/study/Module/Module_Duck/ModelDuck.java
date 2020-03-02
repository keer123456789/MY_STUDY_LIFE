package study.Module.Module_Duck;

import study.Module.Module_Duck.FlyBehavior.FlyNoWay;
import study.Module.Module_Duck.FlyBehavior.FlyRocketPowered;
import study.Module.Module_Duck.QuackBehavior.Quack;

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
