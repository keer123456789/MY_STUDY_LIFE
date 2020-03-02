package study.Module.Module_Decorate.Coffee;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:32
 * @Description: 猫咪咖啡
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.76;
    }
}
