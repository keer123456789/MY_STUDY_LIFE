package Head_First.Module_TemplateMethod.Simple;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_TemplateMethod
 * @Author: keer
 * @CreateTime: 2020-02-19 17:42
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
