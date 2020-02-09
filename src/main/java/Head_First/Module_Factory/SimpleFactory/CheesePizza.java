package Head_First.Module_Factory.SimpleFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.SimpleFactory
 * @Author: keer
 * @CreateTime: 2020-02-09 14:11
 * @Description:
 */
public class CheesePizza extends Pizza {
    public CheesePizza(){
        name="Cheese Pizza";
        dough="大面皮";
        sauce="花生酱";
        toppings.add("新鲜的奶酪");
        toppings.add("芝士");
    }
}
