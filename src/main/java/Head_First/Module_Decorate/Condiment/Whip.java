package Head_First.Module_Decorate.Condiment;

import Head_First.Module_Decorate.Coffee.Beverage;
import Head_First.Module_Decorate.Condiment.CondimentDecorator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:41
 * @Description: 奶
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.54;
    }
}
