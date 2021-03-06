package study.Module.Module_Decorate;

import study.Module.Module_Decorate.Coffee.Beverage;
import study.Module.Module_Decorate.Coffee.DarkRoast;
import study.Module.Module_Decorate.Coffee.Espresso;
import study.Module.Module_Decorate.Coffee.HouseBlend;
import study.Module.Module_Decorate.Condiment.Mocha;
import study.Module.Module_Decorate.Condiment.Soy;
import study.Module.Module_Decorate.Condiment.Whip;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:45
 * @Description: 咖啡售卖站
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
