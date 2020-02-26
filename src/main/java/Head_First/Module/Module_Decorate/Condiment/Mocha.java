package Head_First.Module.Module_Decorate.Condiment;

import Head_First.Module.Module_Decorate.Coffee.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:34
 * @Description: 调料：摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    public double cost() {
        return 0.20+beverage.cost();
    }
}
