package Head_First.Module_Factory.AbstractFactory.Pizza;

import Head_First.Module_Factory.AbstractFactory.Factory.PizzaIngredientFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.AbstractFactory.Pizza
 * @Author: keer
 * @CreateTime: 2020-02-09 17:09
 * @Description:
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
