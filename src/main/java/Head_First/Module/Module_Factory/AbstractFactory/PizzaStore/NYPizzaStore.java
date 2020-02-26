package Head_First.Module.Module_Factory.AbstractFactory.PizzaStore;

import Head_First.Module.Module_Factory.AbstractFactory.Factory.NYPizzaIngredientFactory;
import Head_First.Module.Module_Factory.AbstractFactory.Factory.PizzaIngredientFactory;
import Head_First.Module.Module_Factory.AbstractFactory.Pizza.*;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.AbstractFactory.PizzaStore
 * @Author: keer
 * @CreateTime: 2020-02-09 17:18
 * @Description:
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}