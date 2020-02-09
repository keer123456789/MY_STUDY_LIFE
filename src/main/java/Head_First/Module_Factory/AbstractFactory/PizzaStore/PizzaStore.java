package Head_First.Module_Factory.AbstractFactory.PizzaStore;

import Head_First.Module_Factory.AbstractFactory.Pizza.Pizza;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.AbstractFactory.PizzaStore
 * @Author: keer
 * @CreateTime: 2020-02-09 17:15
 * @Description: 披萨店
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}