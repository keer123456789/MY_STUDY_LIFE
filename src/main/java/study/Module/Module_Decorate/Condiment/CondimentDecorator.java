package study.Module.Module_Decorate.Condiment;

import study.Module.Module_Decorate.Coffee.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:22
 * @Description: 调料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
