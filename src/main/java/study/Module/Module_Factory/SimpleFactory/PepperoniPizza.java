package study.Module.Module_Factory.SimpleFactory;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory.SimpleFactory
 * @Author: keer
 * @CreateTime: 2020-02-09 14:18
 * @Description:
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name="意大利辣肉肠";
        dough="薄饼状";
        sauce="肉酱";
        toppings.add("肉肠");
        toppings.add("意大利芝士");
    }
}
