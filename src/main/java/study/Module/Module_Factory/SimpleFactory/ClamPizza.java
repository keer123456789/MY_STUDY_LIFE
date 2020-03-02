package study.Module.Module_Factory.SimpleFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.SimpleFactory
 * @Author: keer
 * @CreateTime: 2020-02-09 14:16
 * @Description:
 */
public class ClamPizza extends Pizza{
    public ClamPizza(){
        name="蛤蜊披萨";
        dough="厚饼";
        sauce="海鲜酱";
        toppings.add("新鲜蛤蜊");
        toppings.add("海盐");
    }
}
