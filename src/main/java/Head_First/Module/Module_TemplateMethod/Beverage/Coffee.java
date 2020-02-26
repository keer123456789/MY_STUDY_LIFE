package Head_First.Module.Module_TemplateMethod.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_TemplateMethod.Beverage
 * @Author: keer
 * @CreateTime: 2020-02-19 17:45
 * @Description:
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
