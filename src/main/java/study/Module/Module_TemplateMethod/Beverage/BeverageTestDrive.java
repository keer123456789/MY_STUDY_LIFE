package study.Module.Module_TemplateMethod.Beverage;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_TemplateMethod.Beverage
 * @Author: keer
 * @CreateTime: 2020-02-19 17:46
 * @Description:
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

    }
}