package Head_First.Module_Decorate.Condiment;

import Head_First.Module_Decorate.Coffee.Beverage;
import Head_First.Module_Decorate.Condiment.CondimentDecorator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:38
 * @Description: 豆浆
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 1.30;
    }
}
