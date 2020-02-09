package Head_First.Module_Factory.AbstractFactory.Factory;

import Head_First.Module_Factory.AbstractFactory.Ingredient.*;
import Head_First.Module_Factory.AbstractFactory.Ingredient.CheeseImpl.ReggianoCheese;
import Head_First.Module_Factory.AbstractFactory.Ingredient.ClamsImpl.FreshClams;
import Head_First.Module_Factory.AbstractFactory.Ingredient.DoughImpl.ThinCrustDough;
import Head_First.Module_Factory.AbstractFactory.Ingredient.PepperoniImpl.SlicedPepperoni;
import Head_First.Module_Factory.AbstractFactory.Ingredient.SauceImpl.MarinaraSauce;
import Head_First.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Garlic;
import Head_First.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Mushroom;
import Head_First.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Onion;
import Head_First.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.RedPepper;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.AbstractFactory.Factory
 * @Author: keer
 * @CreateTime: 2020-02-09 17:19
 * @Description:
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
