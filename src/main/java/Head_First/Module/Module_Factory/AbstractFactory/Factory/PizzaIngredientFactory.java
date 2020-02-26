package Head_First.Module.Module_Factory.AbstractFactory.Factory;

import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.*;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.AbstractFactory.Ingredient
 * @Author: keer
 * @CreateTime: 2020-02-09 17:09
 * @Description: 披萨调料工厂店
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}