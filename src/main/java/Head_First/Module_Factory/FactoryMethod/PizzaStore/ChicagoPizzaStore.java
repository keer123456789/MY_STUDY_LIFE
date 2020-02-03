package Head_First.Module_Factory.FactoryMethod.PizzaStore;

import Head_First.Module_Factory.FactoryMethod.Pizza.*;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-03 19:36
 * @Description: 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
