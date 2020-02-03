package Head_First.Module_Factory.FactoryMethod.PizzaStore;

import Head_First.Module_Factory.FactoryMethod.Pizza.Pizza;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-02 23:09
 * @Description: 披萨商店
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
