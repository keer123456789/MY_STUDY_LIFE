package study.Module.Module_Factory.AbstractFactory.PizzaStore;

import study.Module.Module_Factory.AbstractFactory.Factory.ChicagoPizzaIngredientFactory;
import study.Module.Module_Factory.AbstractFactory.Factory.PizzaIngredientFactory;
import study.Module.Module_Factory.AbstractFactory.Pizza.*;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.AbstractFactory.PizzaStore
 * @Author: keer
 * @CreateTime: 2020-02-09 17:17
 * @Description:
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}