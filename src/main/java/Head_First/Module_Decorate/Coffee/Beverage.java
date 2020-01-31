package Head_First.Module_Decorate.Coffee;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Decorate
 * @Author: keer
 * @CreateTime: 2020-01-31 16:17
 * @Description: 原味咖啡
 */
public abstract class Beverage {
    String description = "原味 咖啡";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
