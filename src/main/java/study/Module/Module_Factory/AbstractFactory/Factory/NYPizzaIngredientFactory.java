package study.Module.Module_Factory.AbstractFactory.Factory;

import study.Module.Module_Factory.AbstractFactory.Ingredient.*;
import study.Module.Module_Factory.AbstractFactory.Ingredient.CheeseImpl.ReggianoCheese;
import study.Module.Module_Factory.AbstractFactory.Ingredient.ClamsImpl.FreshClams;
import study.Module.Module_Factory.AbstractFactory.Ingredient.DoughImpl.ThinCrustDough;
import study.Module.Module_Factory.AbstractFactory.Ingredient.PepperoniImpl.SlicedPepperoni;
import study.Module.Module_Factory.AbstractFactory.Ingredient.SauceImpl.MarinaraSauce;
import study.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Garlic;
import study.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Mushroom;
import study.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.Onion;
import study.Module.Module_Factory.AbstractFactory.Ingredient.VeggiesImpl.RedPepper;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.AbstractFactory.Factory
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
