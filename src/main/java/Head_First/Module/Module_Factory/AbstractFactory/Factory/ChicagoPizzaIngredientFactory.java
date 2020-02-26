package Head_First.Module.Module_Factory.AbstractFactory.Factory;

import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.*;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.CheeseImpl.MozzarellaCheese;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.ClamsImpl.FrozenClams;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.DoughImpl.ThickCrustDough;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.PepperoniImpl.SlicedPepperoni;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.SauceImpl.PlumTomatoSauce;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.BlackOlives;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Eggplant;
import Head_First.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Spinach;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.AbstractFactory.Factory
 * @Author: keer
 * @CreateTime: 2020-02-09 17:20
 * @Description:
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
