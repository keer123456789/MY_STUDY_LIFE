package Head_First.Module_Factory.SimpleFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.SimpleFactory
 * @Author: keer
 * @CreateTime: 2020-02-09 14:29
 * @Description:
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
