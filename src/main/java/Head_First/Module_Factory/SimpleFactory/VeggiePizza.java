package Head_First.Module_Factory.SimpleFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Factory.SimpleFactory
 * @Author: keer
 * @CreateTime: 2020-02-09 14:21
 * @Description:
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name="蔬菜披萨";
        dough="高筋面饼";
        sauce="香菇酱";
        toppings.add("土豆");
        toppings.add("彩椒");
        toppings.add("口蘑");
    }
}
