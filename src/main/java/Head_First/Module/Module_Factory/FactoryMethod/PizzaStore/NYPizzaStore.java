package Head_First.Module.Module_Factory.FactoryMethod.PizzaStore;

import Head_First.Module.Module_Factory.FactoryMethod.Pizza.*;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-03 19:34
 * @Description: 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
