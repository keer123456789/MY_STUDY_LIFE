package Head_First.Module_Decorate.Condiment;

import Head_First.Module_Decorate.Coffee.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:22
 * @Description: 调料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
