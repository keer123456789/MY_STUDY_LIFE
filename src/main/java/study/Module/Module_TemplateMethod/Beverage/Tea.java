package study.Module.Module_TemplateMethod.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_TemplateMethod.Beverage
 * @Author: keer
 * @CreateTime: 2020-02-19 17:45
 * @Description:
 */
public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
