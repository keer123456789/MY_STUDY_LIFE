package Head_First.Module_Decorate.Coffee;

import Head_First.Module_Decorate.Coffee.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:32
 * @Description: 猫咪咖啡
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 0.76;
    }
}
