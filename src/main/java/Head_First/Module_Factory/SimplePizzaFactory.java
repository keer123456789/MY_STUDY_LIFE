package Head_First.Module_Factory;


import Head_First.Module_Factory.FactoryMethod.Pizza.ChicagoStyleCheesePizza;
import Head_First.Module_Factory.FactoryMethod.Pizza.NYStyleCheesePizza;
import Head_First.Module_Factory.FactoryMethod.Pizza.Pizza;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-02 23:13
 * @Description: pizza工厂店
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("ChicagoStyleCheese")){
            pizza=new ChicagoStyleCheesePizza();
        }else if(type.equals("NYStyleChess")){
            pizza=new NYStyleCheesePizza();
        }
        return pizza;
    }
}
