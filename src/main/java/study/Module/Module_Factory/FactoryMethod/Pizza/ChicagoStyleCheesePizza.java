package study.Module.Module_Factory.FactoryMethod.Pizza;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-02 23:41
 * @Description: 芝加哥芝士披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name="Chicago style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("shredded Mozzarella Cheese");
    }
    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
