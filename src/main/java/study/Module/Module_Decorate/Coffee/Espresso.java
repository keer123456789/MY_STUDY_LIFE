package study.Module.Module_Decorate.Coffee;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:23
 * @Description: 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
